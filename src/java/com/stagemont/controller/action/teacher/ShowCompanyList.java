package com.stagemont.controller.action.teacher;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowCompanyList extends AbstractAction {

    private final CompanySource DATA_SOURCE = new CompanyDAO();

    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        List<Company> lstCompany = DATA_SOURCE.getAllCompany();
        request.setAttribute("listCompany", lstCompany);
        String userType = session.getAttribute("type").toString();
        String viewPath = userType + "/companyList";
        return viewPath;
    }

}
