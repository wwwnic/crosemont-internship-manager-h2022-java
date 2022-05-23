package com.stagemont.controller.action.edit.delete;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;

/**
 *
 * @author Nicolas Brunet
 */
public class DeleteStudent extends AbstractAction {

    private final StudentSource S_SOURCE = new StudentDAO();

    @Override
    public String execute() {

        String userId = request.getParameter("id");

        if (userId != null) {
            S_SOURCE.deleteStudent(Integer.parseInt(userId));
            request.setAttribute("msgSuccess", "Étudiant supprimé");
        } else {
            request.setAttribute("msgError", "Cet étudiant est impossible à supprimer");
        }

        String viewPath = "~showStudentList";
        return viewPath;
    }

}
