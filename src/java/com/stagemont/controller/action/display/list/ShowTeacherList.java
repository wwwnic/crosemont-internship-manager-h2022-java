/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.list;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Teacher;
import com.stagemont.source.teacher.TeacherDAO;
import com.stagemont.source.teacher.TeacherSource;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowTeacherList extends AbstractAction {

    private static TeacherSource DATA_SOURCE = new TeacherDAO();

    @Override
    public String execute() {
        List<Teacher> lstTeacher = DATA_SOURCE.getAllTeacher();
        request.setAttribute("teacherList", lstTeacher);
        String viewPath = "appControl/teacherList";
        return viewPath;
    }

}
