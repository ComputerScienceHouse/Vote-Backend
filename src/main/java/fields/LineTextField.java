package fields;

import org.json.simple.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineTextField extends TextField {
    public static final int MAXLENGTH = 128;
    LineTextField() {
        super(LineTextField.MAXLENGTH);
    }

    LineTextField(int max) {
        super(max);
    }
    public JSONObject toJSON() {
        return null;
    }

    public String toString() {
        return null;
    }
}
