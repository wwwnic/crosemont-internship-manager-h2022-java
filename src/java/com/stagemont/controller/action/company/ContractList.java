/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.company;

import com.stagemont.controller.actionsHelper.AbstractAction;
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
public class ContractList extends AbstractAction {

    private final ContractSource DATA_CONTRACTS_DAO = new ContractDAO();

    private static StudentSource DATA_STUDENT_DAO = new StudentDAO();

    @Override
    public String execute() {

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
        return userType + "/contractList";
    }

}
