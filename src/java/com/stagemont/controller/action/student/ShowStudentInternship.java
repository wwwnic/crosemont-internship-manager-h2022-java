/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.student;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Internship;
import com.stagemont.source.internship.InternshipDAO;
import com.stagemont.source.internship.InternshipSource;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jefferson
 */
public class ShowStudentInternship extends AbstractAction  {

    private final InternshipSource I_SOURCE = new InternshipDAO();
    
    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        List<Internship> lstIntern = I_SOURCE.getAllInternship();
        String userType = session.getAttribute("type").toString();
        request.setAttribute("listInternship", lstIntern);
        
        String viewPath = userType + "/internList";
        return viewPath;
    }
    
}