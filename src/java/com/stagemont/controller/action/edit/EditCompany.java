/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.util.CompanyInputUtil;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class EditCompany extends AbstractAction {

    private final CompanySource SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        CompanyInputUtil inputUtil = new CompanyInputUtil(request);
        String id = inputUtil.getIdFromRequest();
        String cname = inputUtil.getNameFromRequest();
        String cphone = inputUtil.getPhoneFromRequest();
        String email = inputUtil.getEmailFromRequest();
        String perInCharge = inputUtil.getPersonInChargeFromRequest();
        String pw = inputUtil.getPasswordFromRequest();

        List<String> lstInput = Arrays.asList(cname, cphone, email, perInCharge, pw);
        boolean isListContainsNull = inputUtil.isListContainsNull(lstInput);

        String userType = request.getSession(false).getAttribute("type").toString();

        if (isListContainsNull) {
            request.setAttribute("msgError", "Information refusée");
            request.setAttribute("id", id);
            String viewPath = userType + "/editCompanyForm";
            return viewPath;
        }

        Company company = new Company(
                Integer.parseInt(id),
                cname,
                pw,
                cphone,
                email,
                perInCharge
        );

        SOURCE.updateCompany(company);
        request.setAttribute("msgSuccess", company.getName() + " a été modifié avec succès");

        List<Company> lstCompany = SOURCE.getAllCompany();
        request.setAttribute("listCompany", lstCompany);
        String viewPath = userType + "/companyList";
        return viewPath;
    }

}
