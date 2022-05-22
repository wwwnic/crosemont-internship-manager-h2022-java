package com.stagemont.controller.action;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author Brune
 */
public class ByDefault extends AbstractAction {

    @Override
    public String execute() {
        Object type = request.getSession(false);
        if (type == null) {
            return "login";
        } else {
            return "error";
        }
    }
}
