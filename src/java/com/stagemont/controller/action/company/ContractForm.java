/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Status;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;

/**
 *
 * @author melis
 */
public class ContractForm extends AbstractAction {
    
    private static ContractSource DATA_CONTRACT_DAO = new ContractDAO();

    @Override
    public String execute() {
        Status statusNew= null;
        int id = Integer.parseInt(request.getParameter("idC"));
        
        com.stagemont.entities.Contract contract = DATA_CONTRACT_DAO.getContractById(id);
        
        String passwordSUBMIT, passwordINTERVIEW;
        
        passwordSUBMIT = request.getParameter("mdpSUBMIT");
        passwordINTERVIEW = request.getParameter("mdpINTERVIEW");
        
        System.out.println("PRINT: "+ passwordSUBMIT + " " + passwordINTERVIEW);
            
        if(passwordSUBMIT!=null) {
            statusNew = Status.INTERVIEW;
            contract.setStatus(statusNew);
            DATA_CONTRACT_DAO.updateContract(contract);
        } else if(passwordINTERVIEW!=null) {
            statusNew = Status.EMPLOY;
            contract.setStatus(statusNew);
            DATA_CONTRACT_DAO.updateContract(contract);
        }
        
        
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/contract";
    }
    
}
