package fields;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LongTextField extends TextField {
    public static final String PROPERTY_NAME = "LongTextField";
    public static final int MAXLENGTH = 10000;
    LongTextField() {
        super(LongTextField.MAXLENGTH);
    }

    LongTextField(int max) {
        super(max);
    }

    public JSONObject toJSON() {
        JSONObject jso = super.toJSON();
        JSONObject props = (JSONObject) JSONValue.parse(jso.get(JSONable.PROPERTIES).toString());
        props.put(JSONable.NAME, PROPERTY_NAME);
        jso.remove(JSONable .PROPERTIES);
        jso.put(JSONable.PROPERTIES, props);
        return jso;
    }

    public String toString() {
        return null;
    }
}