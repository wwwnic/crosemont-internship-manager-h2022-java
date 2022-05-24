/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import javax.servlet.http.Cookie;

/**
 *
 * @author Nicolas Brunet
 */
public class Dashboard extends AbstractAction {

    private static CompanySource DATA_COMPANY_DAO = new CompanyDAO();

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

        Company company = DATA_COMPANY_DAO.getCompanyFromId(idConnecte);

        request.setAttribute("id", company.getId());
        request.setAttribute("name", company.getFirstname());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());

        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/dashboard";
    }

}
