/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.dashboard;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowCompanyDashboard extends AbstractAction {

    private final CompanySource SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        int companyId = Integer.parseInt(request.getParameter("id"));
        Company company = SOURCE.getCompanyFromId(companyId);

        request.setAttribute("id", company.getId());
        request.setAttribute("name", company.getFirstname());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());

        String viewPath = "appControl/companyEditDashboard";
        return viewPath;
    }
}
