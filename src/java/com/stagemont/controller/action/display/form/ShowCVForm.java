/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.form;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowCVForm extends AbstractAction {

    @Override
    public String execute() {
        String uid = request.getParameter("id");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        request.setAttribute("id", uid);
        request.setAttribute("fname", fname);
        request.setAttribute("lname", lname);
        String viewPath = "student/createCv";
        return viewPath;
    }
}
