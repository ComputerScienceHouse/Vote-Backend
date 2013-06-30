package fields;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/29/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class SelectionField extends Field implements Serializable{
    public static final String PROPERTY_OPTIONS = "options";
    ArrayList<String> options;

    public SelectionField()  {
        super();
        options = new ArrayList<String>();
    }

    public void addOption(String s) {
        options.add(s);
    }

    public void addOption(int index, String s) {
        this.options.add(index, s);
    }
    public ArrayList<String> getOptions() {
        ArrayList<String> opts = new ArrayList<String>();
        for(String s : options) {
            opts.add(s);
        }
        return opts;
    }

    public void removeOption(int index) {
        options.remove(index);
    }

    public void removeOption(String s) {
        options.remove(s);
    }

    public String toString() {
        return null;
    }
}
