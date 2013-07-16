package Database;

import junit.framework.TestCase;
import fields.*;

import java.sql.SQLException;

/**
 * Author: Andrew Hanes
 * Date: 7/15/13
 * Time: 8:48 PM
 */
public class DatabaseTest extends TestCase {
    Database d;
    boolean inited = false;
    public void setUp() throws Exception {
        try {
            d = new Database("localhost", "postgres", "", "myapp_test"); //For travis-ci
            try {
                d.initTables();
            } catch(SQLException e) {

            }
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception("Error setting up database connection");
        }
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAddVotingUser() throws Exception {
        d.addVotingUser(33);
        assert(d.globalVotingUserExists(33));
    }

    public void testGlobalVotingUserExists() throws Exception {
        assert(!d.globalVotingUserExists(123123));
        d.addVotingUser(1);
        assert(d.globalVotingUserExists(1));
    }

    public void testAddFormVotingUser() throws Exception {
        int owner = 3;
        int taker = 2;
        d.addVotingUser(owner); //Owner
        d.addVotingUser(taker); //Taker
        Form f = new Form();
        f.addField(new FieldHeader("Hello"));
        f.addField(new LongTextField());
        d.storeForm(owner, f);
        int formId = d.getAllUserFormIds(owner)[0];
        d.addFormVotingUser(taker, formId);
        assert(d.isValidFormVoter(taker, formId));
        d.removeFormVotingUser(taker, formId);
        assert(!d.isValidFormVoter(taker, formId));
    }

    public void testStoreForm() throws Exception {

    }

    public void testGetAllUserFormIds() throws Exception {

    }

    public void testGetForm() throws Exception {

    }

    public void testAlreadyVoted() throws Exception {

    }

    public void testStoreFormResponse() throws Exception {

    }

    public void testFormExists() throws Exception {

    }

    public void testGetAllFormResponse() throws Exception {

    }
}
