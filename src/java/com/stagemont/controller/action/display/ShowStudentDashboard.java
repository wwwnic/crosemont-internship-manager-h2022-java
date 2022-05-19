/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Student;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowStudentDashboard extends AbstractAction {

    private final StudentSource SOURCE = new StudentDAO();

    @Override
    public String execute() {

        String userId = request.getParameter("id");
        HttpSession session = request.getSession(false);
        if (userId == null) {
             userId = session.getAttribute("id").toString();
        }
        String userType = session.getAttribute("type").toString();
        Student student = SOURCE.getStudentFromId(Integer.parseInt(userId));
        request.setAttribute("student", student);
        String viewPath = userType + "/studentDashboard";
        return viewPath;
    }
}
