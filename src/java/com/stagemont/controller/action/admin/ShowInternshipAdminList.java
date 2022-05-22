/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.admin;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.Internship;
import com.stagemont.source.internship.InternshipDAO;
import com.stagemont.source.internship.InternshipSource;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowInternshipAdminList extends AbstractAction {

    private final InternshipSource I_SOURCE = new InternshipDAO();

    @Override
    public String execute() {
        List<Internship> lstInternship = I_SOURCE.getAllInternship();
        request.setAttribute("internshipList", lstInternship);
        return "admin/internshipAdminList";
    }

}
