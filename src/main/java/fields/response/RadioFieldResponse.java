package fields.response;

import java.util.ArrayList;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:33 PM
 */
public class RadioFieldResponse extends SelectionFieldResponse {
    public RadioFieldResponse(ArrayList<String> opts) {
        super(opts);
    }

    public void setSelected(ArrayList<Boolean> sel) {
        int count = 0;
        for(int i = 0; i < sel.size(); ++i) {
            if(sel.get(i)) {
                ++count;
            }
        }
        if(count > 1) {
            throw new IllegalArgumentException("Must select only one option");
        }
        else {
            super.setSelected(sel);
        }
    }
}
