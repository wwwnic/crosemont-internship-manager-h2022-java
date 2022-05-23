/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class ContractEdit extends AbstractAction {

    private static ContractSource DATA_CONTRACT_DAO = new ContractDAO();

    @Override
    public String execute() {
        String idString =request.getParameter("idC");
        //int idC =Integer.parseInt(request.getParameter("idC"));
        int idC=-1;
        
        if (!idString.equals("")){
            idC =Integer.parseInt(idString);
            request.setAttribute("idC", idC);
        }
        
        com.stagemont.entities.Contract contract = DATA_CONTRACT_DAO.getContractById(idC);

        String dateDebut = request.getParameter("dateDebut");
        String dateFin = request.getParameter("dateFin");

        if (dateDebut!=null && dateFin!=null) {
            contract.setStart_date(java.sql.Date.valueOf(dateDebut));
            contract.setEnd_date(java.sql.Date.valueOf(dateFin));
        }

        DATA_CONTRACT_DAO.updateContract(contract);

        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/contractEdit";
    }

}
