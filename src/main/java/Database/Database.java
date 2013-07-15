package Database;

import fields.Form;
import fields.response.FormResponseSet;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Database {
    private Connection conn;

    public Database() {
        try {
            Scanner in = new Scanner(new FileReader(new File("dbauth.txt")));
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://" + in.nextLine(), in.nextLine(),
                    in.nextLine());
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Cannot find dbauth file.");
            System.exit(3);
        }
        catch(SQLException e2) {
            e2.printStackTrace();
            System.err.println("Sql Exception");
            System.exit(2);
        }

    }

    public void addVotingUser(int userId) throws SQLException{
        String q = "insert into VotingUser values (?);";
        PreparedStatement st = conn.prepareStatement(q);
        st.setInt(1, userId);
        st.executeUpdate();
    }

    public boolean votingUserExists(int userId) throws SQLException {
        String q = "select * from VotingUser where userId = ?";
        PreparedStatement st = conn.prepareStatement(q);
        st.setInt(1, userId);
        ResultSet rs = st.executeQuery();
        return rs.next();
    }

    public void storeForm(int userId, Form form) throws SQLException {
        try {
            FormResponseSet resp = new FormResponseSet();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oout = new ObjectOutputStream(baos);
            oout.writeObject(form);
            oout.close();
            ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            ObjectOutputStream oout2 = new ObjectOutputStream(baos2);
            oout2.writeObject(resp);
            oout2.close();
            String q = "insert into Form (ownerId, formobject, formresponse) values(?,?,?)";
            PreparedStatement st = conn.prepareStatement(q);
            st.setInt(1, userId);
            st.setBytes(2, baos.toByteArray());
            st.setBytes(3, baos2.toByteArray());
            st.executeUpdate();
        } catch(IOException e) {
            e.printStackTrace();
            throw new SQLException("Unable to serialize object");
        }
    }

    public Integer[] getAllUserFormIds(int userId) throws SQLException {
        String q = "select * from form where ownerid = ?";
        PreparedStatement st = conn.prepareStatement(q);
        st.setInt(1, userId);
        ResultSet rs = st.executeQuery();
        ArrayList <Integer> forms = new ArrayList<Integer>();
        while(rs.next()) {
            forms.add(rs.getInt(1));
        }
        System.out.println(forms);
        return forms.toArray(new Integer[forms.size()]);
    }

    public Form getForm(int formId) throws SQLException, FormNotFoundException {
        String q = "select formobject from form where formid = ?";
        PreparedStatement st = conn.prepareStatement(q);
        st.setInt(1, formId);
        ResultSet rs = st.executeQuery();
        Form f;
        try {
            rs.next();
            byte[] buf = rs.getBytes(1);
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf));
            return (Form) in.readObject();
        }
        catch(SQLException e) {
            e.printStackTrace();
            throw new FormNotFoundException("Form does not exist");
        }

        catch(IOException e2) {
            e2.printStackTrace();
            throw new FormNotFoundException("IO Exception when retreiving form");
        }

        catch (ClassNotFoundException e3) {
            e3.printStackTrace();
            throw new FormNotFoundException("Cannot find form class");
        }
    }
    public FormResponseSet getFormResponseSet(int formId) throws SQLException, FormNotFoundException {
        String q = "select formresponse from form where formid = ?";
        PreparedStatement st = conn.prepareStatement(q);
        st.setInt(1, formId);
        ResultSet rs = st.executeQuery();
        Form f;
        try {
            rs.next();
            byte[] buf = rs.getBytes(1);
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf));
            return (FormResponseSet) in.readObject();
        }
        catch(SQLException e) {
            e.printStackTrace();
            throw new FormNotFoundException("Form does not exist");
        }

        catch(IOException e2) {
            e2.printStackTrace();
            throw new FormNotFoundException("IO Exception when retreiving form");
        }

        catch (ClassNotFoundException e3) {
            e3.printStackTrace();
            throw new FormNotFoundException("Cannot find form class");
        }
    }

    public void updateFormResponseSet(int formid) {

    }



}
