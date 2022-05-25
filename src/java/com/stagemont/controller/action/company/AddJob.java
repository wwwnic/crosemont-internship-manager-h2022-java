/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Job;
import com.stagemont.source.job.JobDAO;
import com.stagemont.source.job.JobSource;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class AddJob extends AbstractAction {

    private static JobSource DATA_JOB_DAO = new JobDAO();
    
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
        
        //Job(int id, String title, String description, Date start_date, Date end_date, int company_id)
        String title = request.getParameter("titreJ");
        String desc = request.getParameter("descJ");
        String debut = request.getParameter("debutJ");
        String fin = request.getParameter("finJ");
        
        Job j = null;
        if(title!=null && desc!=null && debut!=null && fin!=null) {
            j = new Job(90, title, desc, java.sql.Date.valueOf(debut), java.sql.Date.valueOf(fin), idConnecte);
            DATA_JOB_DAO.insertJob(j);
            return "~showJobsList";
        }
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/addJobForm";
    }
    
}
