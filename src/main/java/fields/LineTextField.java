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
    public LineTextField(String prompt) {
        super(prompt, LineTextField.MAXLENGTH);
    }

    public LineTextField(String prompt, int max) {
        super(prompt, max);
    }

    public LineTextField() {
        super("Null", 0);
    }

    public String toString() {
        return null;
    }

    public FieldResponse generateResponseObject() {
        return new LineTextFieldResponse();
    }
    public String generateHtml() {
        return super.getPrompt() + ": <input id=\"" + super.getIdent().toString() + "\" type=\"text\" maxlength=\""+ super.getMaxChars()
                +"\" name=\"" + super.getPrompt() + "\"><br />";
    }
}
