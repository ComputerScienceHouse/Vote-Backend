package fields;

import fields.response.FieldResponse;
import fields.response.FormResponse;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/24/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Form implements Serializable {
    private ArrayList<Field> elements;
    public Form(ArrayList<Field> elements) {
        this.elements = elements;
    }

    public Form() {
        this.elements = new ArrayList<Field>();
    }

    public Field getField(int index) {
        return this.elements.get(index);
    }

    public void removeField(int index) {
        elements.remove(index);
    }

    public void addField(int index, Field f) {
        this.elements.add(index, f);
    }

    public void addField(Field f) {
        this.elements.add(f);
    }

    public FormResponse generateFormResponse() {
        ArrayList<FieldResponse> resp = new ArrayList<FieldResponse>();
        for(Field f : elements) {
            resp.add(f.generateResponseObject());
        }
        return new FormResponse(resp);
    }
}
