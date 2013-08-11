package fields;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/25/13
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class RadioFieldTest {
    @Test
    public void testAddAndGetOption() throws Exception {
        RadioField f = new RadioField();
        f.addOption("Testing");
        assert(f.getOptions().contains("Testing"));
    }

    @Test
    public void testRemoveOptionInt() throws Exception {
        RadioField f = new RadioField();
        f.addOption("test");
        f.removeOption(0);
        assert(f.getOptions().size() == 0);
    }

    @Test
    public void testRemoveOptionString() throws Exception {
        RadioField f = new RadioField();
        f.addOption("test");
        f.removeOption("test");
        assert(f.getOptions().size() == 0);
    }

    @Test
    public void testGenerateHTML() throws Exception {
        RadioField f = new RadioField();
        f.addOption("Test1");
        f.addOption("Test2");
        System.out.println(f.generateHtml());
    }
}
