/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.dashboard;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Teacher;
import com.stagemont.source.teacher.TeacherDAO;
import com.stagemont.source.teacher.TeacherSource;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowTeacherDashboard extends AbstractAction {

    private final TeacherSource SOURCE = new TeacherDAO();

    @Override
    public String execute() {
        int teacherId = Integer.parseInt(request.getParameter("id"));
        Teacher teacher = SOURCE.getTeacherFromId(teacherId);

        request.setAttribute("id", teacher.getId());
        request.setAttribute("fname", teacher.getFirstname());
        request.setAttribute("lname", teacher.getLastname());

        String viewPath = "appControl/teacherEditDashboard";
        return viewPath;
    }
}
