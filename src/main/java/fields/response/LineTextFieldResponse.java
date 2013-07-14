package fields.response;

import fields.LineTextField;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:31 PM
 */
public class LineTextFieldResponse extends TextFieldResponse {
    public LineTextFieldResponse() {
    }

    public void setResponse(String response) {
        if(response.length() < LineTextField.MAXLENGTH)
            this.response = response;
        else
            throw new IllegalArgumentException("Length must be less than " + LineTextField.MAXLENGTH);
    }

}
