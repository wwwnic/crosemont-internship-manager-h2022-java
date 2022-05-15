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
import com.stagemont.util.StudentInputUtil;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class EditStudent extends AbstractAction {

    private final StudentSource SOURCE = new StudentDAO();

    @Override
    public String execute() {
        System.out.println("Je suis appelé !");
        StudentInputUtil inputUtil = new StudentInputUtil(request);
        String id = inputUtil.getIdFromRequest();
        String fname = inputUtil.getFirstNameFromRequest();
        String lname = inputUtil.getLastNameFromRequest();
        String da = inputUtil.getDAFromRequest();
        String pw = inputUtil.getPasswordFromRequest();
        // cv = request.getParameter("cv");
        // String letter = request.getParameter("lettre");

        List<String> lstInput = Arrays.asList(id, fname, lname, da, pw);
        boolean isListContainsNull = inputUtil.isListContainsNull(lstInput);

        String userType = request.getSession(false).getAttribute("type").toString();

        if (isListContainsNull) {
            request.setAttribute("msgError", "Information refusée");
            request.setAttribute("uid", id);
            String viewPath = userType + "/editStudentForm";
            return viewPath;
        }

        Student cvLetterStu = SOURCE.getStudentFromId(Integer.parseInt(id));
        Student student = new Student(
                Integer.parseInt(id),
                fname,
                lname,
                pw,
                Integer.parseInt(da),
                cvLetterStu.getCv(),
                cvLetterStu.getLetter()
        );

        SOURCE.updateStudent(student);
        request.setAttribute("msgSuccess", student.getFirstname() + " a été modifié avec succès");

        List<Student> lstStudent = SOURCE.getAllStudents();
        request.setAttribute("listStudent", lstStudent);
        String viewPath = userType + "/studentList";
        return viewPath;
    }

}
