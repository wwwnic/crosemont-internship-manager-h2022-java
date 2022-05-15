/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.teacher;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Student;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowStudentList extends AbstractAction {

    private final StudentSource S_SOURCE = new StudentDAO();

    @Override
    public String execute() {
        HttpSession session = request.getSession(false);
        List<Student> lstStudent = S_SOURCE.getAllStudents();
        String userType = session.getAttribute("type").toString();
        request.setAttribute("listStudent", lstStudent);

        String viewPath = userType + "/studentList";
        return viewPath;
    }

}