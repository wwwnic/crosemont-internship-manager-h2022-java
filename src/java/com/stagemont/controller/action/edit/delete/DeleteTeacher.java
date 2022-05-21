/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit.delete;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Student;
import com.stagemont.entities.Teacher;
import com.stagemont.source.teacher.TeacherDAO;
import com.stagemont.source.teacher.TeacherSource;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class DeleteTeacher extends AbstractAction {

    private final TeacherSource T_SOURCE = new TeacherDAO();

    @Override
    public String execute() {

        String userId = request.getParameter("id");

        if (userId != null) {
            T_SOURCE.deleteTeacher(Integer.parseInt(userId));
            request.setAttribute("msgSuccess", "Le professeur a été supprimé");
        } else {
            request.setAttribute("msgError", "Ce professeur est impossible à supprimer");
        }

        List<Teacher> lstTeacher = T_SOURCE.getAllTeacher();
        request.setAttribute("teacherList", lstTeacher);
        String viewPath = "appControl/teacherList";
        return viewPath;
    }

}
