package com.stagemont.controller.action.edit.delete;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;

/**
 *
 * @author Nicolas Brunet
 */
public class DeleteCompany extends AbstractAction {

    private final CompanySource C_SOURCE = new CompanyDAO();

    @Override
    public String execute() {

        String companyId = request.getParameter("id");

        if (companyId != null) {
            C_SOURCE.deleteCompany(Integer.parseInt(companyId));
            request.setAttribute("msgSuccess", "Entreprise supprimée");
        } else {
            request.setAttribute("msgError", "Cette entreprise est impossible à supprimer");
        }
        String viewPath = "~showCompanyList";
        return viewPath;
    }

}
