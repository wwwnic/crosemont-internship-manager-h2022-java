/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Company;
import com.stagemont.entities.Contract;
import com.stagemont.entities.ContractRelation;
import com.stagemont.entities.Student;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowStudentDashboard extends AbstractAction {

    private final StudentSource STUDENT_SOURCE = new StudentDAO();
    private final ContractSource CONTRACT_SOURCE = new ContractDAO();
    private final CompanySource COMPANY_SOURCE = new CompanyDAO();

    @Override
    public String execute() {

        String userId = request.getParameter("id");
        HttpSession session = request.getSession(false);
        if (userId == null) {
             userId = session.getAttribute("id").toString();
        }
        String userType = session.getAttribute("type").toString();
        int studentId = Integer.parseInt(userId);
        Student student = STUDENT_SOURCE.getStudentFromId(studentId);
        List<Contract> lstContract = CONTRACT_SOURCE.getContractByStudentId(studentId);

        List<ContractRelation> lstContRelation = new ArrayList();
        for (Contract cont : lstContract) {
            Company company = COMPANY_SOURCE.getCompanyFromId(cont.getCompany_id());
            ContractRelation contRelation = new ContractRelation(cont, company);
            contRelation.getContract().getStart_date().toString();
            lstContRelation.add(contRelation);
        }
        
        request.setAttribute("lstContRelation", lstContRelation);
        request.setAttribute("student", student);
        String viewPath = userType + "/studentDashboard";
        return viewPath;
    }
}
