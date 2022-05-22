package com.stagemont.controller.action.edit.delete;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.source.teacher.TeacherDAO;
import com.stagemont.source.teacher.TeacherSource;

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

        String viewPath = "~showTeacherList";
        return viewPath;
    }

}
