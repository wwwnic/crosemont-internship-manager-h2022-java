/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit.add;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Contract;
import com.stagemont.entities.Internship;
import com.stagemont.entities.Status;
import com.stagemont.entities.Student;
import com.stagemont.source.contract.ContractDAO;
import com.stagemont.source.contract.ContractSource;
import com.stagemont.source.internship.InternshipDAO;
import com.stagemont.source.internship.InternshipSource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import java.util.Date;
import javax.servlet.http.Cookie;

/**
 *
 * @author melis
 */
public class AddContractInternship extends AbstractAction {

    private static ContractSource DATA_CONTRACT_DAO = new ContractDAO();
    
    private static StudentSource DATA_STUDENT_DAO  = new StudentDAO();
    
    private static InternshipSource DATA_INTERNSHIP_DAO  = new InternshipDAO();
    
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
        
        int internshipId;
        internshipId = Integer.parseInt(request.getParameter("idI"));
        
        
        Internship i = null;
        i = DATA_INTERNSHIP_DAO.getInternshipFromId(internshipId);
        
        //Contract(int id, Date start_date, Date end_date, Status status, int company_id, int student_id)
        
        String dateD = i.getStart_date().toString();
        String dateF = i.getEnd_date().toString();
        Contract c = new Contract(90, java.sql.Date.valueOf(dateD), java.sql.Date.valueOf(dateF), Status.SUBMIT, i.getCompany_id(), idConnecte);
        DATA_CONTRACT_DAO.insertContract(c);
        
        return "~showStudentDashboard";
    }
    
}
