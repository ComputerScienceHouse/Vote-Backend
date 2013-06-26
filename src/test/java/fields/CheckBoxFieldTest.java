package fields;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/25/13
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckBoxFieldTest {
    @Test
    public void testToJSON() throws Exception {
        CheckBoxField f = new CheckBoxField();
        f.addOption("Test1");
        f.addOption("Test2");
        String s = f.toJSON().toJSONString();
        JSONObject jso = (JSONObject) JSONValue.parse(s);
        System.out.println("Checkbox JSON:\n" + jso);
    }
}
