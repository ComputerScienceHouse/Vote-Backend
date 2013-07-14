package Database;

import org.junit.Test;

/**
 * Author: Andrew Hanes
 * Date: 7/14/13
 * Time: 6:08 PM
 */
public class DatabaseTest {
    @Test
    public void testAddVotingUser() throws Exception {
        //new Database().addVotingUser(2);
    }
    @Test
    public void testVotingUserExists() throws Exception {
        assert(new Database().votingUserExists(1));
    }

    @Test
    public void testCreateObject() throws Exception {
        Database d = new Database();
    }
}
