/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit.add;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Contract;
import com.stagemont.entities.Job;
import com.stagemont.entities.Status;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.job.JobDAO;
import com.stagemont.source.job.JobSource;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class AddContractJob extends AbstractAction {
    
    private static ContractSource DATA_CONTRACT_DAO = new ContractDAO();
    
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
        
        int jobId;
        jobId = Integer.parseInt(request.getParameter("idJ"));
        
        Job j = null;
        j = DATA_JOB_DAO.getJobFromId(jobId);
        
        //Contract(int id, Date start_date, Date end_date, Status status, int company_id, int student_id)
        
        String dateD = j.getStart_date().toString();
        String dateF = j.getEnd_date().toString();
        Contract c = new Contract(90, java.sql.Date.valueOf(dateD), java.sql.Date.valueOf(dateF), Status.SUBMIT, j.getCompany_id(), idConnecte);
        DATA_CONTRACT_DAO.insertContract(c);
        
        return "~showStudentDashboard";
        
    }
    
    
}
