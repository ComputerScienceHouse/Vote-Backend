package fields;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/24/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Form {
    private ArrayList<Field> elements;
    Form(ArrayList<Field> elements) {
        this.elements = elements;
    }

    Form() {
        this.elements = new ArrayList<Field>();
    }

    public void removeField(int index) {
        elements.remove(index);
    }

    public void addField(Field f, int index) {

    }
}
