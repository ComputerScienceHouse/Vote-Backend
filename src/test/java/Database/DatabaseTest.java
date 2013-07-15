package Database;

import fields.CheckBoxField;
import fields.FieldHeader;
import fields.Form;
import fields.LongTextField;
import fields.response.FormResponseSet;
import org.junit.Test;
/**
 * Author: Andrew Hanes
 * Date: 7/14/13
 * Time: 6:08 PM
 */
public class DatabaseTest {
    @Test
    public void testAddVotingUser() throws Exception {
        //new Database().addVotingUser(1);
    }
    @Test
    public void testVotingUserExists() throws Exception {
        assert(new Database().votingUserExists(1));
    }

    @Test
    public void testCreateObject() throws Exception {
        Database d = new Database();
    }

    //@Test
    public void testStoreForm() throws Exception {
        Database d = new Database();
        Form f = new Form();
        f.addField(new LongTextField(50));
        f.addField(new CheckBoxField());
        f.addField(new FieldHeader("Hello World"));
        d.storeForm(1, f);
    }

    @Test
    public void testGetAllUsersFormIds() throws Exception {
        Database d = new Database();
        d.getAllUserFormIds(1);
    }

    //@Test
    public void testGetForm() throws Exception {
        Database d = new Database();
        Form f = d.getForm(1);
        assert(f.getField(2) instanceof FieldHeader);
        FieldHeader head= (FieldHeader) f.getField(2);
        System.out.println(head.getText());
    }

    @Test
    public void testGetFormResponseSet() throws Exception {
        Database d = new Database();
        FormResponseSet frs = d.getFormResponseSet(5);
    }
}
