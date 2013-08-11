package fields;

import fields.response.CheckBoxFieldResponse;
import fields.response.FieldResponse;

import java.util.UUID;

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

    public String generateHtml() {
        UUID uuid = UUID.randomUUID();
        String line = "";
        for(String s : super.options) {
            line += "<input type=\"checkbox\" name=\"" + super.getIdent().toString() +
                    "\" value=\"" + s + "\" > " + s + "<br />\n";
        }
        return line;
    }
}
