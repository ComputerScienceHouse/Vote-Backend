package fields;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/25/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextFieldTest {

    @Test
    public void testSetAndGetMaxChars() throws Exception {
        TextField f = new LongTextField("SAD", 6);
        assert(f.getMaxChars() == 6);
        f.setMaxChars(1000);
        assert(f.getMaxChars() == 1000);

        TextField f2 = new LineTextField("ASD", 50);
        assert(f2.getMaxChars() == 50);
        f2.setMaxChars(20);
        assert(f2.getMaxChars() == 20);
    }

    @Test
    public void testGenerateHtml() throws Exception {
        TextField f = new LineTextField("Name", 5);
        System.out.println(f.generateHtml());
        f = new LongTextField("Name2");
        System.out.println(f.generateHtml());
    }
}
