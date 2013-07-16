package Database;

import fields.CheckBoxField;
import fields.FieldHeader;
import fields.Form;
import fields.LongTextField;
/**
 * Author: Andrew Hanes
 * Date: 7/14/13
 * Time: 6:08 PM
 */
public class DatabaseTest {

  //  @Test
    public void testAddVotingUser() throws Exception {
        new Database().addVotingUser(1);
    }
  //  @Test
    public void testVotingUserExists() throws Exception {
        System.out.println("ASD");
        assert(new Database().globalVotingUserExists(1));
        assert(!new Database().globalVotingUserExists(-1));
    }

  //  @Test
    public void testCreateObject() throws Exception {
        Database d = new Database();
    }

  //  @Test
    public void testStoreForm() throws Exception {
        Database d = new Database();
        Form f = new Form();
        f.addField(new LongTextField(50));
        f.addField(new CheckBoxField());
        f.addField(new FieldHeader("Hello World"));
        d.storeForm(1, f);
    }

   // @Test
    public void testGetAllUsersFormIds() throws Exception {
        Database d = new Database();
        d.getAllUserFormIds(1);
    }

   // @Test
    public void testGetForm() throws Exception {
        Database d = new Database();
        Form f = d.getForm(1);
        assert(f.getField(2) instanceof FieldHeader);
        FieldHeader head= (FieldHeader) f.getField(2);
        System.out.println(head.getText());
    }
    //@Test
    public void testAddGlobalUser() throws Exception {
        Database d = new Database();
        d.addVotingUser(93123);
    }

    //@Test
    public void testRemoveGlobalUser() throws Exception {
        Database d = new Database();
        assert(!d.isValidFormVoter(3, 5));
    }

    //@Test
    public void testAddVotingUserToForm() throws Exception {
        Database d = new Database();
        d.addVotingUser(2);
    }
}
