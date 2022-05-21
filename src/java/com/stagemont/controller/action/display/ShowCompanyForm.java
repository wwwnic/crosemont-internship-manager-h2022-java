/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowCompanyForm extends AbstractAction {

    @Override
    public String execute() {
        String id = request.getParameter("id");
        request.setAttribute("id", id);
        String userType = request.getSession(false).getAttribute("type").toString();
        String viewPath = userType + "/editCompanyForm";
        return viewPath;
    }
}
