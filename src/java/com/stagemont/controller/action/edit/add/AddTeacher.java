package com.stagemont.controller.action.edit.add;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Teacher;
import com.stagemont.source.teacher.TeacherDAO;
import com.stagemont.source.teacher.TeacherSource;
import com.stagemont.util.TeacherInputUtil;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class AddTeacher extends AbstractAction {

    private final TeacherSource T_SOURCE = new TeacherDAO();

    @Override
    public String execute() {
        TeacherInputUtil inputUtil = new TeacherInputUtil(request);
        String fname = inputUtil.getFirstNameFromRequest();
        String lname = inputUtil.getLastNameFromRequest();
        String pw = inputUtil.getPasswordFromRequest();

        List<String> lstInput = Arrays.asList(fname, lname, pw);
        boolean isListContainsNull = inputUtil.isListContainsNull(lstInput);

        if (isListContainsNull) {
            request.setAttribute("msgError", "Information refusée");
            String redirectToType = "teacher";
            request.setAttribute("redirectToType", redirectToType);
            String viewPath = "admin/addUserForm";
            return viewPath;
        }

        Teacher teacher = new Teacher(
                0,
                fname,
                lname,
                pw
        );

        T_SOURCE.insertTeacher(teacher);
        request.setAttribute("msgSuccess", teacher.getFirstname() + " a été ajouté avec succès");
        String viewPath = "~showTeacherList";
        return viewPath;
    }

}
