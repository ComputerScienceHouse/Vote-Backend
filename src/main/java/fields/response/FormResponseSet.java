package fields.response;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:30 PM
 */
public class FormResponseSet implements Serializable {
    private ArrayList<FormResponse> set;
    private int formId;

    public FormResponseSet(int formId) {
        this.formId = formId;
        this.set = new ArrayList<FormResponse>();
    }

    public FormResponse getFormResponse(int index) {
        return this.set.get(index);
    }

    public void addFormResponse(FormResponse r) {
        this.set.add(r);
    }

    public int getSize() {
        return this.set.size();
    }
}
