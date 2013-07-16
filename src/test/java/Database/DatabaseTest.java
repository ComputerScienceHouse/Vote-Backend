package Database;

import junit.framework.TestCase;

/**
 * Author: Andrew Hanes
 * Date: 7/15/13
 * Time: 8:48 PM
 */
public class DatabaseTest extends TestCase {
    Database d;
    public void setUp() throws Exception {
        try {
            d = new Database("localhost", "postgres", "", "myapp_test"); //For travis-ci
            //d = new Database("dbauth.txt");
            d.initTables();
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception("Error setting up database connection");
        }
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAddVotingUser() throws Exception {
        d.alreadyVoted(1, 1);
    }

    public void testGlobalVotingUserExists() throws Exception {

    }

    public void testAddFormVotingUser() throws Exception {

    }

    public void testRemoveFormVotingUser() throws Exception {

    }

    public void testIsValidFormVoter() throws Exception {

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
