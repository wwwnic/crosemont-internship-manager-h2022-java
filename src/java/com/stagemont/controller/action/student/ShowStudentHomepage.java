/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.student;

import com.stagemont.controller.actionsHelper.AbstractAction;

/**
 *
 * @author Jefferson
 */
public class ShowStudentHomepage extends AbstractAction{

    @Override
    public String execute() {
        String userType = request.getSession(false).getAttribute("type").toString();
        String viewPath = userType + "/homepage";
        return viewPath;
    }
    
}
