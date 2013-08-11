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

    private String prompt;
    public TextField(String prompt, int maxChars) {
        super();
        this.maxChars = maxChars;
        this.setPrompt(prompt);
    }

    public TextField(String prompt) {
        super();
        this.maxChars = 0;
        this.setPrompt(prompt);
    }

    public int getMaxChars() {
        return maxChars;
    }

    public void setMaxChars(int maxChars) {
        this.maxChars = maxChars;
    }
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

}
