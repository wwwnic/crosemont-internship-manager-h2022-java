/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.student;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Job;
import com.stagemont.source.job.JobDAO;
import com.stagemont.source.job.JobSource;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jefferson
 */
public class ShowStudentJobs extends AbstractAction  {
    
    private final JobSource J_SOURCE = new JobDAO();

    @Override
    public String execute() {
        
        HttpSession session = request.getSession(false);
        List<Job> lstJob = J_SOURCE.getAllJob();
        String userType = session.getAttribute("type").toString();    
        request.setAttribute("listJob", lstJob);
        
        String viewPath = userType + "/jobList";        
        return viewPath;
    }
    
}
