package Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
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



}
