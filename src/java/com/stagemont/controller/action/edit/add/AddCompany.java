/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit.add;

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
public class AddCompany extends AbstractAction {

    private final CompanySource SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        CompanyInputUtil inputUtil = new CompanyInputUtil(request);
        String cname = inputUtil.getNameFromRequest();
        String cphone = inputUtil.getPhoneFromRequest();
        String email = inputUtil.getEmailFromRequest();
        String perInCharge = inputUtil.getPersonInChargeFromRequest();
        String pw = inputUtil.getPasswordFromRequest();

        List<String> lstInput = Arrays.asList(cname, cphone, email, perInCharge, pw);
        boolean isListContainsNull = inputUtil.isListContainsNull(lstInput);

        if (isListContainsNull) {
            request.setAttribute("msgError", "Information refusée");
            String redirectToType = "company";
            request.setAttribute("redirectToType", redirectToType);
            String viewPath = "admin/addUserForm";
            return viewPath;
        }

        Company company = new Company(
                0,
                cname,
                pw,
                cphone,
                email,
                perInCharge
        );

        SOURCE.insertCompany(company);
        request.setAttribute("msgSuccess", company.getName() + " a été ajouté avec succès");

        List<Company> lstCompany = SOURCE.getAllCompany();
        request.setAttribute("listCompany", lstCompany);
        String viewPath = "appControl/companyList";
        return viewPath;
    }

}
