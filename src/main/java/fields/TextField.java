package fields;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class TextField extends Field {

    public static final String PROPERTY_MAXCHARS = "max";
    private int maxChars;

    public TextField(int maxChars) {
        super();
        this.maxChars = maxChars;
    }

    public TextField() {
        super();
        this.maxChars = 0;
    }

    public int getMaxChars() {
        return maxChars;
    }

    public void setMaxChars(int maxChars) {
        this.maxChars = maxChars;
    }
}
