/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Student;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractFakeData;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentFakeData;
import com.stagemont.source.student.StudentSource;
import java.util.List;

/**
 *
 * @author melis
 */
public class ContractList extends AbstractAction {

    private final ContractSource DATA_CONTRACTS = new ContractFakeData();
    
    private final ContractSource DATA_CONTRACTS_DAO = new ContractDAO();
    
    private static StudentSource DATA_STUDENT = new StudentFakeData();
    
    private static StudentSource DATA_STUDENT_DAO  = new StudentDAO();
    
    
    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");        
        
        // List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS.getAllContract();
        
        List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS_DAO.getAllContract();
        request.setAttribute("listContracts", listContracts);
        
        List<Student> listStudents = DATA_STUDENT.getAllStudents();
        request.setAttribute("listStudents", listStudents);
        
        request.getRequestDispatcher("contractList.jsp").forward(request, response);
    }
    */

    @Override
    public String execute() {
        
        // List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS.getAllContract();
        
        List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS_DAO.getAllContract();
        request.setAttribute("listContracts", listContracts);
        
        List<Student> listStudents = DATA_STUDENT_DAO.getAllStudents();
        request.setAttribute("listStudents", listStudents);
        
        
        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/contractList";
    }

    

}
