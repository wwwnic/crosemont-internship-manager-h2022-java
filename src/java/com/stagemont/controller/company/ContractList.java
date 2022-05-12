/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.company;

import com.stagemont.entities.Company;
import com.stagemont.entities.Student;
import com.stagemont.source.company.CompagnyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractFakeData;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.student.StudentFakeData;
import com.stagemont.source.student.StudentSource;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author melis
 */
public class ContractList extends HttpServlet {

    private final ContractSource DATA_CONTRACTS = new ContractFakeData();
    
    private final ContractSource DATA_CONTRACTS_DAO = new ContractDAO();
    
    private static StudentSource DATA_STUDENT = new StudentFakeData();
    
    private static CompanySource DATA_COMPANY_DAO = new CompagnyDAO();
    
    
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
        response.setContentType("text/html;charset=UTF-8");        
        
        // List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS.getAllContract();
        
        List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS_DAO.getAllContract();
        request.setAttribute("listContracts", listContracts);
        
        List<Student> listStudents = DATA_STUDENT.getAllStudents();
        request.setAttribute("listStudents", listStudents);
        
        request.getRequestDispatcher("contractList.jsp").forward(request, response);
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
