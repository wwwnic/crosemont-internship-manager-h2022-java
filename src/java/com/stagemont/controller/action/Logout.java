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

    private void addHeader() {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
    }

    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        session.invalidate();
        if (request.getSession(false) == null) {
            request.setAttribute("msgSuccess", "Déconnexion terminée");
        } else {
            request.setAttribute("msgError", "Déconnexion non terminée");
        }
        addHeader();
        return "login";
    }
}
