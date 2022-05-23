/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.admin;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowHomepage extends AbstractAction {

    @Override
    public String execute() {
        String viewPath = "homepage";
        return viewPath;
    }
}
