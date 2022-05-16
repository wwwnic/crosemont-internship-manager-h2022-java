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

/**
 *
 * @author Nicolas Brunet
 */
public class DeleteStudent extends AbstractAction {

    private final StudentSource S_SOURCE = new StudentDAO();

    @Override
    public String execute() {

        String userId = request.getParameter("id");
        String userType = request.getSession(false).getAttribute("type").toString();

        if (userId != null) {
            S_SOURCE.deleteStudent(Integer.parseInt(userId));
            request.setAttribute("msgSuccess", "Étudiant supprimé");
        } else {
            request.setAttribute("msgError", "Cet étudiant est impossible à supprimer");
        }

        List<Student> lstStudent = S_SOURCE.getAllStudents();
        request.setAttribute("listStudent", lstStudent);
        String viewPath = userType + "/studentList";
        return viewPath;
    }

}
