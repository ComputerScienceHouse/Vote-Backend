package Database;

import fields.*;
import junit.framework.TestCase;

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
            d = new Database("dbauth.txt");
            /*d = new Database("localhost", "postgres", "", "myapp_test"); //For travis-ci*/
            try {
                d.initTables();
            }
            catch(Exception e) {
                d.cleanTables();
                d.initTables();
            }
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception("Error setting up database connection");
        }
    }

    public void tearDown() throws Exception {
        super.tearDown();
        d.cleanTables();
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

    public void testAddFormVoterAlreadyAdded() throws Exception {
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
        try {
            d.addFormVotingUser(taker, formId);
        } catch (Exception e) {
            assert(d.isValidFormVoter(taker, formId));
            return;
        }
        assert(false);
    }

    public void testStoreFormLongTextField() throws Exception {
        int owner = 3;
        d.addVotingUser(owner);
        Form f = new Form();
        f.addField(new LongTextField());
        d.storeForm(owner, f);
        int formId = d.getAllUserFormIds(owner)[0];
        Form form2 = d.getForm(formId);
        assertTrue(form2.getField(0) instanceof LongTextField);
    }

    public void testStoreFormLineTextField() throws Exception {
        int owner = 3;
        d.addVotingUser(owner);
        Form f = new Form();
        f.addField(new LineTextField());
        d.storeForm(owner, f);
        int formId = d.getAllUserFormIds(owner)[0];
        Form form2 = d.getForm(formId);
        assertTrue(form2.getField(0) instanceof LineTextField);
    }

    public void testStoreFormLCheckboxField() throws Exception {
        int owner = 3;
        d.addVotingUser(owner);
        Form f = new Form();
        f.addField(new CheckBoxField());
        d.storeForm(owner, f);
        int formId = d.getAllUserFormIds(owner)[0];
        Form form2 = d.getForm(formId);
        assertTrue(form2.getField(0) instanceof CheckBoxField);
    }

    public void testStoreFormRadioField() throws Exception {
        int owner = 3;
        d.addVotingUser(owner);
        Form f = new Form();
        f.addField(new RadioField());
        d.storeForm(owner, f);
        int formId = d.getAllUserFormIds(owner)[0];
        Form form2 = d.getForm(formId);
        assertTrue(form2.getField(0) instanceof RadioField);
    }

    public void testStoreFormHeader() throws Exception {
        int owner = 3;
        d.addVotingUser(owner);
        Form f = new Form();
        f.addField(new FieldHeader("Hello"));
        d.storeForm(owner, f);
        int formId = d.getAllUserFormIds(owner)[0];
        Form form2 = d.getForm(formId);
        assertTrue(form2.getField(0) instanceof FieldHeader);
        assertTrue(((FieldHeader) form2.getField(0)).getText().equals("Hello"));
    }

    public void testGetAllUserFormIds() throws Exception {
        int owner = 5;
        d.addVotingUser(5);
        for(int i = 0; i < 10; ++i) {
            d.storeForm(owner, new Form());
        }
        assertTrue(d.getAllUserFormIds(owner).length == 10);
    }

    public void testAlreadyVoted() throws Exception {

    }

    public void testStoreFormResponse() throws Exception {

    }

    public void testFormExists() throws Exception {
        int owner = 5;
        int owner2 = 3;
        d.addVotingUser(5);
        d.addVotingUser(3);
        for(int i = 0; i < 50; ++i) {
            if(i%3 == 0)
                d.storeForm(owner, new Form());
            else
                d.storeForm(owner2, new Form());
        }
        Integer[] ids = d.getAllUserFormIds(owner);
        for(int i = 0; i < ids.length; ++i) {
            assertTrue(d.formExists(ids[i]));
        }
    }

    public void testGetAllFormResponse() throws Exception {

    }
}
