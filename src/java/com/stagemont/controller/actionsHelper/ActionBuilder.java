/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.actionsHelper;

import com.stagemont.controller.action.ByDefault;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ActionBuilder {

    public static Action getAction(HttpServletRequest request) {
        Action action = null;
        String userType = "";
        HttpSession session = request.getSession(false);
        if (session == null) {
            return new ByDefault();
        }
        System.out.println("la session est active? " + request.getSession(false));

        String actionToDo;
        String servletPath = request.getServletPath();
        System.out.println("servlet to action a faire " + servletPath);

        servletPath = servletPath.substring(1);
        int i = servletPath.indexOf("/");
        if (i == -1) {
            actionToDo = servletPath;
        } else {
            actionToDo = servletPath.substring(0, i);
        }
        i = actionToDo.indexOf(".");
        if (i != -1) {
            actionToDo = actionToDo.substring(0, i);
        }
        Object userTypeAttribute = session.getAttribute("type");
        userType = userTypeAttribute != null ? userTypeAttribute.toString() : "";

        switch (userType) {
            case "student":
                action = BuilderHelper.iterateActionStudent(actionToDo);
                break;
            case "teacher":
                action = BuilderHelper.iterateActionTeacher(actionToDo);
                break;
            case "company":
                action = BuilderHelper.iterateActionCompany(actionToDo);
                break;
            case "admin":
                action = BuilderHelper.iterateActionAdmin(actionToDo);
        }

        if (action == null) {
            action = BuilderHelper.iterateActionOther(actionToDo);
        }

        return action;
    }
}
