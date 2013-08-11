package fields;

import fields.response.FieldResponse;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Field implements Serializable {

    private UUID ident;
    private boolean required;
    private String fieldName;

    public Field() {
        this.required = false;
        ident = UUID.randomUUID();
    }

    public Field(boolean required) {
        this.required = required;
        ident = UUID.randomUUID();
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

    public UUID getIdent() {
        return ident;
    }

    public abstract FieldResponse generateResponseObject();

    public abstract String generateHtml();

}
