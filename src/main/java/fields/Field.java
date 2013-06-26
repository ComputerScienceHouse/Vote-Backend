package fields;

import org.json.simple.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Field implements JSONable {

    private long formId;
    private boolean required;
    private String fieldName;

    public Field() {
        this.required = false;
    }

    public Field(boolean required) {
        this.required = required;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public JSONObject toJSON() {
        JSONObject jso = new JSONObject();
        jso.put(JSONable.NAME, this.fieldName);
        jso.put(JSONable.REQUIRED, this.required);
        return jso;
    }
}
