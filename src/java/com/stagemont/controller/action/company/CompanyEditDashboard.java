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
 * @author melis
 */
public class CompanyEditDashboard extends AbstractAction {

    private static CompanySource DATA_COMPANY_DAO = new CompanyDAO();
    
    @Override
    public String execute() {
        Cookie[] idCookie = request.getCookies();
        int idConnecte=-1;
        if (idCookie!=null) {
            for (int i=0; i<idCookie.length; i++) {
                if ((idCookie[i].getName()).equals("idConnecte")){
                    idConnecte = Integer.parseInt(idCookie[i].getValue());
                }
            }
        }
        request.setAttribute("idConnecte", idConnecte);
        
        //Company companyOriginal = DATA_COMPANY_DAO.getCompanyFromId(id);
        
        //Company(int id, String name, String password, String phone, String email, String personInCharge)
        
        String name = request.getParameter("nomC");
        String password = request.getParameter("mdpC");
        String phone = request.getParameter("telC");
        String email = request.getParameter("courrielC");
        String personInCharge = request.getParameter("nomC");
        
        Company company = new Company(idConnecte, name, password, phone, email, personInCharge);
        
        DATA_COMPANY_DAO.updateCompany(company);
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/editDashboard";
    }
    
}
