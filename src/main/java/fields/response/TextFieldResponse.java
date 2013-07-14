package fields.response;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:33 PM
 */
public abstract class TextFieldResponse extends FieldResponse {
    String response;
    TextFieldResponse() {
        super();
    }
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
