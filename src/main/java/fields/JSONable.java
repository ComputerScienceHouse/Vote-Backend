package fields; /**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */

import org.json.simple.*;

/**
 * All form elements must inherit from JSONable
 */
public interface JSONable {
    public JSONObject toJSON();
}
