package com.stagemont.controller.action;

import com.stagemont.controller.actionsHelper.AbstractAction;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Brune
 */
public class ByDefault extends AbstractAction {

    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        Object objType = null;
        if (session != null) {
            objType = session.getAttribute("type");
        }
        boolean isSessionConnected = objType != null;
        return isSessionConnected ? "error" : "login";

    }
}
