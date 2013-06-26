package fields;

import org.json.simple.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class TextField extends Field {
    private int maxChars;
    public TextField(int maxChars) {
        super();
        this.maxChars = maxChars;
    }

    public JSONObject toJSON() {
        return null;
    }

    public TextField() {
        super();
        this.maxChars = 0;
    }
}
