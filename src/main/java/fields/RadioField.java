package fields;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class RadioField extends Field {
    public static final String PROPERTY_OPTIONS = "options";
    public static final String NAME = "RadioField";
    ArrayList<String> options;

    public RadioField() {
        super();
        options = new ArrayList<String>();
    }
    public JSONObject toJSON() {
        JSONObject jso = super.toJSON();
        JSONArray opts = new JSONArray();
        for(int i = 0; i < options.size(); ++i) {
            opts.add(i, options.get(i));
        }
        JSONObject properties = new JSONObject();
        properties.put(JSONable.TYPE, NAME);
        properties.put(PROPERTY_OPTIONS, opts);
        jso.put(JSONable.PROPERTIES, properties);
        return jso;
    }

    public void addOption(String s) {
        options.add(s);
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
