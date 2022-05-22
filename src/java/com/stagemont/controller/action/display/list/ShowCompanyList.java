package com.stagemont.controller.action.display.list;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowCompanyList extends AbstractAction {

    private final CompanySource DATA_SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        List<Company> lstCompany = DATA_SOURCE.getAllCompany();
        request.setAttribute("listCompany", lstCompany);
        String viewPath = "appControl/companyList";
        return viewPath;
    }

}
