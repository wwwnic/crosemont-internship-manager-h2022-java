package com.stagemont.controller.action;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author Brune
 */
public class ByDefault extends AbstractAction {

    @Override
    public String execute() {
        return "login";
    }
}
