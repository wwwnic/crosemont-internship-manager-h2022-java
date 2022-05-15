/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.actionsHelper;

import com.stagemont.controller.action.Login;
import com.stagemont.controller.action.ByDefault;
import com.stagemont.controller.action.Logout;
import javax.servlet.http.HttpServletRequest;

public class ActionBuilder {

    public static Action getAction(HttpServletRequest request) {
        Action action = null;
        if (request.getSession(false) == null) {
            request.setAttribute("msgError", "Veuillez vous connecter");
            return new ByDefault();
        }
        System.out.println("la session est active? " + request.getSession(false));

        String actionAFaire;
        String servletPath = request.getServletPath();
        System.out.println("servlet to action a faire " + servletPath);

        servletPath = servletPath.substring(1);
        int i = servletPath.indexOf("/");
        if (i == -1) {
            actionAFaire = servletPath;
        } else {
            actionAFaire = servletPath.substring(0, i);
        }
        i = actionAFaire.indexOf(".");
        if (i != -1) {
            actionAFaire = actionAFaire.substring(0, i);
        }
        switch (actionAFaire) {
            case "login":
                action = new Login();
                break;
            case "logout":
                action = new Logout();
                break;
            default:
                action = new ByDefault();
        }

        return action;
    }
}
