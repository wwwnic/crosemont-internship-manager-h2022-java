/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action;

import com.stagemont.controller.actionsHelper.AbstractAction;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas Brunet
 */
public class Logout extends AbstractAction {

    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        session.invalidate();
        if (request.getSession(false) == null) {
            request.setAttribute("msgSuccess", "Déconnexion terminée");
        } else {
            request.setAttribute("msgError", "Déconnexion non terminée");
        }
        return "login";
    }
}
