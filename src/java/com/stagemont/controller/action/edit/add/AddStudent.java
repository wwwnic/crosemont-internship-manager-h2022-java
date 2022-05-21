/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.edit.add;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Student;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import com.stagemont.util.StudentInputUtil;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class AddStudent extends AbstractAction {

    private final StudentSource SOURCE = new StudentDAO();

    @Override
    public String execute() {
        StudentInputUtil inputUtil = new StudentInputUtil(request);
        String fname = inputUtil.getFirstNameFromRequest();
        String lname = inputUtil.getLastNameFromRequest();
        String da = inputUtil.getDAFromRequest();
        String pw = inputUtil.getPasswordFromRequest();
        String cv = "";
        String letter = "";

        List<String> lstInput = Arrays.asList(fname, lname, da, pw);
        boolean isListContainsNull = inputUtil.isListContainsNull(lstInput);

        if (isListContainsNull) {
            request.setAttribute("msgError", "Information refusée");
            String viewPath = "admin/addUserForm";
            return viewPath;
        }

        Student student = new Student(
                0,
                fname,
                lname,
                pw,
                Integer.parseInt(da),
                cv,
                letter
        );

        SOURCE.insertStudent(student);
        request.setAttribute("msgSuccess", student.getFirstname() + " a été ajouté avec succès");

        List<Student> lstStudent = SOURCE.getAllStudents();
        request.setAttribute("listStudent", lstStudent);
        String viewPath = "appControl/studentList";
        return viewPath;
    }
}
