package fields;

import fields.response.FieldResponse;
import fields.response.LineTextFieldResponse;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineTextField extends TextField {
    public static final int MAXLENGTH = 150;
    LineTextField() {
        super(LineTextField.MAXLENGTH);
    }

    LineTextField(int max) {
        super(max);
    }

    public String toString() {
        return null;
    }

    public FieldResponse generateResponseObject() {
        return new LineTextFieldResponse();
    }
}
