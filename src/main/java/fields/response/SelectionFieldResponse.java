package fields.response;

import java.util.ArrayList;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:33 PM
 */
public abstract class SelectionFieldResponse extends FieldResponse {
    private ArrayList<String> options;
    private ArrayList<Boolean> selected;
    SelectionFieldResponse(int fieldId, ArrayList<String> options) {
        super(fieldId);
        this.options = options;
        this.selected = new ArrayList<Boolean>(options.size());
        for(int i = 0; i < selected.size(); ++i) {
            selected.set(i, false);
        }
    }

    public void setSelected(ArrayList<Boolean> sel) {
        if(sel.size() != options.size()) {
            throw new IllegalArgumentException("Invalid selected list size");
        }
        else {
            this.selected = (ArrayList<Boolean>) sel.clone();
        }
    }

    public Integer[] getSelected() {
        ArrayList<Integer> selectedIndex = new ArrayList<Integer>();
        for(int i = 0; i < selected.size(); ++i) {
            if(selected.get(i)) {
                selectedIndex.add(i);
            }
        }
        return (Integer[]) selectedIndex.toArray();
    }
}
