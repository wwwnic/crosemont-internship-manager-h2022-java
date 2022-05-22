/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.display.list;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Student;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowStudentList extends AbstractAction {

    private final StudentSource S_SOURCE = new StudentDAO();

    @Override
    public String execute() {
        List<Student> lstStudent = S_SOURCE.getAllStudents();
        request.setAttribute("listStudent", lstStudent);
        String viewPath = "appControl/studentList";
        return viewPath;
    }
    
}
