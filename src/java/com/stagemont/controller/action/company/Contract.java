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
import com.stagemont.source.company.CompanyFakeData;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentFakeData;
import com.stagemont.source.student.StudentSource;

/**
 *
 * @author 1816098
 */
public class Contract extends AbstractAction {

    private final CompanySource DATA_SOURCE_COMPANY = new CompanyFakeData();

    private final StudentSource DATA_SOURCE_STUDENT = new StudentFakeData();
    
    private final CompanySource DATA_COMPANY_DAO = new CompanyDAO();
    
    private static StudentSource DATA_STUDENT_DAO  = new StudentDAO();

    
    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int companyId;
        int studentId;
        try {
            companyId = Integer.parseInt(request.getParameter("companyId"));
            studentId = Integer.parseInt(request.getParameter("studentId"));

        } catch (NumberFormatException e) {
            companyId = 0;
            studentId = 0;
        }

        Company company = DATA_SOURCE_COMPANY.getCompanyFromId(companyId);
        Student student = DATA_SOURCE_STUDENT.getStudentFromId(studentId);
        request.setAttribute("name", company.getFirstname());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());
        request.setAttribute("firstName", student.getFirstname());
        request.setAttribute("lastName", student.getLastname());

        request.getRequestDispatcher("contract.jsp").forward(request, response);
    }

    */
    
    @Override
    public String execute() {

        int companyId;
        int studentId;
        try {
            companyId = Integer.parseInt(request.getParameter("companyId"));
            studentId = Integer.parseInt(request.getParameter("studentId"));

        } catch (NumberFormatException e) {
            companyId = 0;
            studentId = 0;
        }
        //companyId=1;
        //studentId=1;

        Company company = DATA_COMPANY_DAO.getCompanyFromId(companyId);
        Student student = DATA_STUDENT_DAO.getStudentFromId(studentId);
        request.setAttribute("name", company.getName());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());
        request.setAttribute("firstName", student.getFirstname());
        request.setAttribute("lastName", student.getLastname());

        String userType = request.getSession(false).getAttribute("type").toString();
        return userType + "/contract";
    
    
    
    }
    
    
    
    

}
