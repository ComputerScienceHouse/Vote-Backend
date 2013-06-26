package fields;

import org.json.simple.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LongTextField extends TextField {
    public static final int MAXLENGTH = 10000;
    LongTextField(long formId) {
        super(formId, LongTextField.MAXLENGTH);
    }

    LongTextField(long formId, int max) {
        super(formId, max);
    }

    public JSONObject toJSON() {
        return null;
    }

    public String toString() {
        return null;
    }
}
