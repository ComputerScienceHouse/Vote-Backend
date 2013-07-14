package fields;

import fields.response.CheckBoxFieldResponse;
import fields.response.FieldResponse;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckBoxField extends SelectionField {

    public CheckBoxField() {
        super();
    }

    public String toString() {
        return null;
    }

    public FieldResponse generateResponseObject() {
        return new CheckBoxFieldResponse(super.options);
    }
}
