package fields;

import fields.response.FieldResponse;
import fields.response.RadioFieldResponse;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class RadioField extends SelectionField {
    public RadioField() {
        super();
    }

    public FieldResponse generateResponseObject() {
        return new RadioFieldResponse(super.options);
    }

    public String generateHtml() {
        UUID uuid = UUID.randomUUID();
        String line = "";
        for(String s : super.options) {
            line += "<input type=\"radio\" name=\"" + super.getIdent().toString()
                    + "\" value=\"" + s + "\" > " + s + "<br />\n";
        }
        return line;
    }
}
