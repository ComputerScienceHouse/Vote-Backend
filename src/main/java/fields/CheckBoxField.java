package fields;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckBoxField extends RadioField {
    public static final String PROPERTY_OPTIONS = "options";
    public static final String NAME = "CheckBox";
    public CheckBoxField() {
        super();
    }
    public JSONObject toJSON() {
        JSONObject jso = super.toJSON();
        JSONObject properties = (JSONObject) JSONValue.parse(jso.get(JSONable.PROPERTIES).toString());
        properties.remove(JSONable.TYPE);
        properties.put(JSONable.TYPE, CheckBoxField.NAME);
        jso.remove(JSONable.PROPERTIES);
        jso.put(JSONable.PROPERTIES, properties);
        return jso;
    }

    public String toString() {
        return null;
    }
}
