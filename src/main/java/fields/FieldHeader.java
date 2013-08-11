package fields;

import fields.response.FieldResponse;

/**
 * Author: Andrew Hanes
 * Date: 7/14/13
 * Time: 9:15 PM
 */
public class FieldHeader extends Field {
    private String text;
    private int hLevel;
    public FieldHeader(String text) {
        this.text = text;
        this.setHLevel(5);
    }

    public FieldHeader(String text, int hLevel) {
        this.text = text;
        this.setHLevel(hLevel);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FieldResponse generateResponseObject() {
        return null;
    }

    public int getHLevel() {
        return hLevel;
    }

    public void setHLevel(int hLevel) {
        if(hLevel > 0 && hLevel < 6) {
            this.hLevel = hLevel;
        }
        else {
            System.err.println("hLevel invalid");
            this.hLevel = 5;
        }
    }

    public String generateHtml() {
        return "<h" + this.hLevel +">" + this.text + "</h" + this.hLevel + "><br />";
    }
}
