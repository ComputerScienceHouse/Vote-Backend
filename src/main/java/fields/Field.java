package fields;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Field implements Serializable {
    public static final String ANONYMOUS = "anonymous";
    private long formId;
    private boolean required;
    private String fieldName;

    private boolean anonymous;

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

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

}
