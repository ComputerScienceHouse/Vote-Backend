package fields;

import fields.response.FieldResponse;
import fields.response.LongTextFieldResponse;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LongTextField extends TextField {
    public static final int MAXLENGTH = 2000;
    public LongTextField(String prompt) {
        super(prompt, LongTextField.MAXLENGTH);
    }

    public LongTextField(String prompt, int max) {
        super(prompt, max);
    }

    public String toString() {
        return null;
    }

    public LongTextField() {
        super("Null", 0);
    }

    public FieldResponse generateResponseObject() {
        return new LongTextFieldResponse();
    }

    public String generateHtml() {
        return super.getPrompt() + "<br /><textarea id=\"" + super.getIdent().toString() + "\" maxlength=\""+ super.getMaxChars()
                +"\" name=\"" + super.getPrompt() + "\"></textarea><br />";
    }

}
