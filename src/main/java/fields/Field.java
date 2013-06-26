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

    protected Field(long formID) {
        this.formId = formID;
        this.required = false;
    }

    protected Field(long formID, boolean required) {
        this.formId = formID;
        this.required = required;
    }

    public long getFormId() {
        return formId;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public abstract JSONObject toJSON();
}
