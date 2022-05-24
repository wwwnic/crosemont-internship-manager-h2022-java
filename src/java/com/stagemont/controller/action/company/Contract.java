/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.entities.Student;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;

/**
 *
 * @author 1816098
 */
public class Contract extends AbstractAction {

    private final CompanySource DATA_COMPANY_DAO = new CompanyDAO();
    
    private static StudentSource DATA_STUDENT_DAO  = new StudentDAO();
    
    private static ContractSource DATA_CONTRACT_DAO = new ContractDAO();
    
    @Override
    public String execute() {

        int companyId;
        int studentId;
        int contractId;
        
        
        try {
            companyId = Integer.parseInt(request.getParameter("companyId"));
            studentId = Integer.parseInt(request.getParameter("studentId"));
            contractId = Integer.parseInt(request.getParameter("contractId"));
        } catch (NumberFormatException e) {
            companyId = -1;
            studentId = -1;
            contractId = -1;
        }

        Company company = DATA_COMPANY_DAO.getCompanyFromId(companyId);
        Student student = DATA_STUDENT_DAO.getStudentFromId(studentId);
        com.stagemont.entities.Contract contract = DATA_CONTRACT_DAO.getContractById(contractId);
        
        
        request.setAttribute("company", company);
        request.setAttribute("student", student);
        request.setAttribute("contract", contract);
        
        //-------
        
        
        
        
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/contract";

    }

}
