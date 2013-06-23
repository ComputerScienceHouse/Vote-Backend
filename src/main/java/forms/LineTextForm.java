package forms;

import org.json.simple.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineTextForm extends TextForm {
    public static final int MAXLENGTH = 128;
    LineTextForm(long formId) {
        super(formId, LineTextForm.MAXLENGTH);
    }

    LineTextForm(long formId, int max) {
        super(formId, max);
    }
    public JSONObject toJSON() {
        return null;
    }

    public String toString() {
        return null;
    }
}
