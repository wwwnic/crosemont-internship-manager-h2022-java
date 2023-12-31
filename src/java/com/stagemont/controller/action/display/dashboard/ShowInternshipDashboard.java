/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.dashboard;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.entities.Internship;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.internship.InternshipDAO;
import com.stagemont.source.internship.InternshipSource;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jefferson
 */
public class ShowInternshipDashboard extends AbstractAction {

    private final InternshipSource I_SOURCE = new InternshipDAO();
    private final CompanySource C_SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        int stageId = Integer.parseInt(request.getParameter("id"));

        Internship intern = I_SOURCE.getInternshipFromId(stageId);
        Company company = C_SOURCE.getCompanyFromId(intern.getCompany_id());

        request.setAttribute("intern", intern);
        request.setAttribute("company", company);

        String viewPath = "search/InfoStage";
        return viewPath;

    }

}
