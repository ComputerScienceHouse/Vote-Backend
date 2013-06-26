package fields;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class TextField extends Field {
    private int maxChars;
    TextField(long formId, int maxChars) {
        super(formId);
        this.maxChars = maxChars;
    }

    TextField(long formId) {
        super(formId);
        this.maxChars = 0;
    }
}
