package fields.response;

import java.io.Serializable;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:31 PM
 */
public abstract class FieldResponse implements Serializable {
    private int fieldId;

    FieldResponse(int formId) {
        this.fieldId = formId;
    }

    public int getFieldId() {
        return fieldId;
    }

}
