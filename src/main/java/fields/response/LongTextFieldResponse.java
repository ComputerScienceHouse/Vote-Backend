package fields.response;

import fields.LongTextField;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:33 PM
 */
public class LongTextFieldResponse extends TextFieldResponse {
    LongTextFieldResponse() {
    }

    public void setResponse(String response) {
        if(response.length() < LongTextField.MAXLENGTH)
            this.response = response;
        else
            throw new IllegalArgumentException("Length must be less than " + LongTextField.MAXLENGTH);
    }
}
