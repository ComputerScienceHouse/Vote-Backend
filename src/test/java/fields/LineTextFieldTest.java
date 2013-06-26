package fields;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/25/13
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineTextFieldTest {
    @Test
    public void testToJSON() throws Exception {
        LineTextField f = new LineTextField(50);
        System.out.println(f.toJSON().toJSONString());
    }
}
