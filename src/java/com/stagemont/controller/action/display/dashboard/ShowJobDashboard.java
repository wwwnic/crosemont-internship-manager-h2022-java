/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.dashboard;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.entities.Job;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.job.JobDAO;
import com.stagemont.source.job.JobSource;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jefferson
 */
public class ShowJobDashboard extends AbstractAction {

    private final JobSource J_SOURCE = new JobDAO();
    private final CompanySource C_SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        int jobId = Integer.parseInt(request.getParameter("id"));

        Job job = J_SOURCE.getJobFromId(jobId);
        Company company = C_SOURCE.getCompanyFromId(job.getCompany_id());
        String userType = session.getAttribute("type").toString();

        //int infoJobId = Integer.parseInt(jobId);
        //Job job = J_SOURCE.getJobFromId(infoJobId);
        //request.setAttribute("listJob", lstJob);
        request.setAttribute("job", job);
        request.setAttribute("company", company);

        String viewPath = "student/InfoEmploi";
        return viewPath;
    }

}
