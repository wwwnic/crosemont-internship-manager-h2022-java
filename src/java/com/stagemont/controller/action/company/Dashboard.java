/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanyFakeData;
import com.stagemont.source.company.CompanySource;

/**
 *
 * @author Nicolas Brunet
 */
public class Dashboard extends AbstractAction {

    private static final String DESTINATION = "/teacher/dashboard.jsp";
    private final CompanySource DATA_SOURCE = new CompanyFakeData();

    private static CompanySource DATA_COMPANY_DAO = new CompanyDAO();
    
    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int companyId;
        try {
            companyId = Integer.parseInt(request.getParameter("CompanyId"));
        } catch (NumberFormatException e) {
            companyId = 0;
        }
        Company company = DATA_COMPANY_DAO.getCompanyFromId(companyId);
        //Company company = DATA_SOURCE.getCompanyFromId(companyId);

        request.setAttribute("name", company.getFirstname());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }
    */

    @Override
    public String execute() {
        int companyId;
        
        try {
            companyId = Integer.parseInt(request.getParameter("CompanyId"));
        } catch (NumberFormatException e) {
            companyId = 1;
        }
        
        Company company = DATA_COMPANY_DAO.getCompanyFromId(companyId);
        //Company company = DATA_SOURCE.getCompanyFromId(companyId);

        request.setAttribute("name", company.getFirstname());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/dashboard";
    }

    

}
