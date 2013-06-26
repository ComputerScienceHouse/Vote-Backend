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
    LongTextField() {
        super(LongTextField.MAXLENGTH);
    }

    LongTextField(int max) {
        super(max);
    }

    public JSONObject toJSON() {
        return null;
    }

    public String toString() {
        return null;
    }
}
