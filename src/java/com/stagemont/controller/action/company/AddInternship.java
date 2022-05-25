/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Internship;
import com.stagemont.source.internship.InternshipDAO;
import com.stagemont.source.internship.InternshipSource;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class AddInternship extends AbstractAction {

    private static InternshipSource DATA_INTERNSHIP_DAO = new InternshipDAO();
    
    @Override
    public String execute() {
        
        Cookie[] idCookie = request.getCookies();
        int idConnecte = -1;
        if (idCookie != null) {
            for (int i = 0; i < idCookie.length; i++) {
                if ((idCookie[i].getName()).equals("idConnecte")) {
                    idConnecte = Integer.parseInt(idCookie[i].getValue());
                }
            }
        }
        request.setAttribute("idConnecte", idConnecte);
        
        //Internship(int id, String title, String description, Date start_date, Date end_date, int company_id)
        String title = request.getParameter("titreI");
        String desc = request.getParameter("descI");
        String debut = request.getParameter("debutI");
        String fin = request.getParameter("finI");
        
        Internship i = null;
        if(title!=null && desc!=null && debut!=null && fin!=null) {
            i = new Internship(90, title, desc, java.sql.Date.valueOf(debut), java.sql.Date.valueOf(fin), idConnecte);
            DATA_INTERNSHIP_DAO.insertInternship(i);
            return "~showInternshipList";
        }
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/addInternshipForm";
    }
    
}
