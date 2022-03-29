/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.company;

import com.stagemont.entities.Company;
import com.stagemont.entities.Student;
import com.stagemont.source.company.CompanyFakeData;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.student.StudentFakeData;
import com.stagemont.source.student.StudentSource;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1816098
 */
public class Contract extends HttpServlet {

    private final CompanySource DATA_SOURCE_COMPANY = new CompanyFakeData();

    private final StudentSource DATA_SOURCE_STUDENT = new StudentFakeData();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        request.setAttribute("name", company.getName());
        request.setAttribute("phone", company.getPhone());
        request.setAttribute("email", company.getEmail());
        request.setAttribute("personInCharge", company.getPersonInCharge());
        request.setAttribute("firstName", student.getFirstname());
        request.setAttribute("lastName", student.getLastname());

        request.getRequestDispatcher("contract.jsp").forward(request, response);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
