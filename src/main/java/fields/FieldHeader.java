package fields;

import fields.response.FieldResponse;

/**
 * Author: Andrew Hanes
 * Date: 7/14/13
 * Time: 9:15 PM
 */
public class FieldHeader extends Field {
    private String text;
    public FieldHeader(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FieldResponse generateResponseObject() {
        return null;
    }
}
