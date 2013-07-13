package fields.response;

import java.util.ArrayList;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:47 PM
 */
public class FormResponse {
    private ArrayList<FieldResponse> resp;
    int formId;
    FormResponse(int formId) {
        this.formId = formId;
        this.resp = new ArrayList<FieldResponse>();
    }

    public int getFormId() {
        return this.formId;
    }

    void addFieldResponse(int index, FieldResponse r) {
        this.resp.add(index, r);
    }

    void addFieldResponse(FieldResponse r) {
        this.resp.add(r);
    }

    public FieldResponse getFieldResponse(int index) {
        return resp.get(index);
    }
}
