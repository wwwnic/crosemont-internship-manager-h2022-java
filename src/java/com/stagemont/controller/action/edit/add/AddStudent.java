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

    private final StudentSource S_SOURCE = new StudentDAO();

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

        S_SOURCE.insertStudent(student);
        request.setAttribute("msgSuccess", student.getFirstname() + " a été ajouté avec succès");
        String viewPath = "~showStudentList";
        return viewPath;
    }
}
