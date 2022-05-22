/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.list;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Job;
import com.stagemont.source.job.JobDAO;
import com.stagemont.source.job.JobSource;
import java.util.List;

/**
 *
 * @author Jefferson
 */
public class ShowJobsList extends AbstractAction {

    private final JobSource J_SOURCE = new JobDAO();

    @Override
    public String execute() {
        List<Job> lstJob = J_SOURCE.getAllJob();
        request.setAttribute("listJob", lstJob);
        String viewPath = "student/jobList";
        return viewPath;
    }
    
}
