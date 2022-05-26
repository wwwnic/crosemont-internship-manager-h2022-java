/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit.delete;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Contract;
import com.stagemont.entities.Student;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import java.util.List;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class ContractDelete extends AbstractAction {

    private static ContractSource DATA_CONTRACT_DAO = new ContractDAO();

    private final ContractSource DATA_CONTRACTS_DAO = new ContractDAO();

    private static StudentSource DATA_STUDENT_DAO = new StudentDAO();

    @Override
    public String execute() {

        int id = Integer.parseInt(request.getParameter("idC"));
        Contract contract = DATA_CONTRACT_DAO.getContractById(id);
        DATA_CONTRACT_DAO.deleteContract(id);

        //--------------------
        Cookie[] idCookie = request.getCookies();
        int idConnecte = -1;
        if (idCookie != null) {
            for (int i = 0; i < idCookie.length; i++) {
                if ((idCookie[i].getName()).equals("idConnecte")) {
                    idConnecte = Integer.parseInt(idCookie[i].getValue());
                }
            }
        }
        request.setAttribute("idConnecte", idConnecte);

        List<com.stagemont.entities.Contract> listContracts = DATA_CONTRACTS_DAO.getContractByComapnyId(idConnecte);
        request.setAttribute("listContracts", listContracts);

        List<Student> listStudents = DATA_STUDENT_DAO.getAllStudents();
        request.setAttribute("listStudents", listStudents);

        String userType = request.getSession(false).getAttribute("type").toString();
        if (userType.equals("company")) {
            return userType + "/contractList";
        }
        return "~showStudentDashboard?id=" + contract.getStudent_id();
    }

}
