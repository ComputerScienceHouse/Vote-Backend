package webapi;

/**
 * Created with IntelliJ IDEA.
 * User: ahanes
 * Date: 6/23/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteAPI extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        resp.setStatus(503, "Not Implemented");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) {
        resp.setStatus(503, "Not Implemented");
    }

}
