/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.teacher;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.entities.Student;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class DeleteCompany extends AbstractAction {

    private final CompanySource C_SOURCE = new CompanyDAO();

    @Override
    public String execute() {

        String companyId = request.getParameter("id");
        String userType = request.getSession(false).getAttribute("type").toString();

        if (companyId != null) {
            C_SOURCE.deleteCompany(Integer.parseInt(companyId));
            request.setAttribute("msgSuccess", "Entreprise supprimée");
        } else {
            request.setAttribute("msgError", "Cette entreprise est impossible à supprimer");
        }

        List<Company> lstStudent = C_SOURCE.getAllCompany();
        request.setAttribute("listCompany", lstStudent);
        String viewPath = userType + "/companyList";
        return viewPath;
    }

}
