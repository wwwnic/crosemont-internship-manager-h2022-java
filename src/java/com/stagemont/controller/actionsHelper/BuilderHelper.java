/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.actionsHelper;

import com.stagemont.controller.action.ByDefault;
import com.stagemont.controller.action.Login;
import com.stagemont.controller.action.Logout;
import com.stagemont.controller.action.admin.ShowAddUserForm;
import com.stagemont.controller.action.admin.ShowInternshipAdminList;
import com.stagemont.controller.action.admin.ShowJobAdminList;
import com.stagemont.controller.action.display.dashboard.ShowCompanyDashboard;
import com.stagemont.controller.action.display.form.ShowCompanyForm;
import com.stagemont.controller.action.edit.delete.DeleteStudent;
import com.stagemont.controller.action.edit.edit.EditStudent;
import com.stagemont.controller.action.display.dashboard.ShowStudentDashboard;
import com.stagemont.controller.action.display.form.ShowStudentForm;
import com.stagemont.controller.action.student.ShowStudentHomepage;
import com.stagemont.controller.action.student.ShowStudentInfoJob;
import com.stagemont.controller.action.student.ShowStudentInternship;
import com.stagemont.controller.action.student.ShowStudentJobs;
import com.stagemont.controller.action.edit.delete.DeleteCompany;
import com.stagemont.controller.action.edit.edit.EditCompany;
import com.stagemont.controller.action.display.list.ShowCompanyList;
import com.stagemont.controller.action.display.list.ShowStudentList;
import com.stagemont.controller.action.display.list.ShowTeacherList;

/**
 *
 * @author Brune
 */
public interface BuilderHelper {

    public static Action iterateActionStudent(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "test":
                action = new ByDefault();
                break;
            case "showStudentDashboard":
                action = new ShowStudentDashboard();
                break;
            case "showStudentHomepage":
                action = new ShowStudentHomepage();
                break;
            case "showStudentJobs":
                action = new ShowStudentJobs();
                break;
            case "showStudentInternship":
                action = new ShowStudentInternship();
                break;
        }
        return action;
    }

    public static Action iterateActionTeacher(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "showStudentList":
                action = new ShowStudentList();
                break;
            case "showCompanyList":
                action = new ShowCompanyList();
                break;
            case "showStudentForm":
                action = new ShowStudentForm();
                break;
            case "showCompanyForm":
                action = new ShowCompanyForm();
                break;
            case "editStudent":
                action = new EditStudent();
                break;
            case "editCompany":
                action = new EditCompany();
                break;
            case "deleteStudent":
                action = new DeleteStudent();
                break;
            case "deleteCompany":
                action = new DeleteCompany();
                break;
            case "showStudentDashboard":
                action = new ShowStudentDashboard();
                break;
            case "showStudentInfoJob":
                action = new ShowStudentInfoJob();
                break;
            case "showCompanyDashboard":
                action = new ShowCompanyDashboard();
                break;
        }
        return action;
    }

    public static Action iterateActionCompany(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "test":
                action = new ByDefault();
                break;
        }
        return action;
    }

    public static Action iterateActionAdmin(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "showStudentList":
                action = new ShowStudentList();
                break;
            case "showTeacherList":
                action = new ShowTeacherList();
                break;
            case "showCompanyList":
                action = new ShowCompanyList();
                break;
            case "showStudentForm":
                action = new ShowStudentForm();
                break;
            case "showCompanyForm":
                action = new ShowCompanyForm();
                break;
            case "editStudent":
                action = new EditStudent();
                break;
            case "editCompany":
                action = new EditCompany();
                break;
            case "deleteStudent":
                action = new DeleteStudent();
                break;
            case "deleteCompany":
                action = new DeleteCompany();
                break;
            case "showStudentDashboard":
                action = new ShowStudentDashboard();
                break;
            case "showStudentInfoJob":
                action = new ShowStudentInfoJob();
                break;
            case "showCompanyDashboard":
                action = new ShowCompanyDashboard();
                break;
            case "showInternshipAdminList":
                action = new ShowInternshipAdminList();
                break;
            case "showJobAdminList":
                action = new ShowJobAdminList();
                break;
            case "showAddUserForm":
                action = new ShowAddUserForm();
                break;
        }
        return action;
    }

    public static Action iterateActionOther(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "login":
                action = new Login();
                break;
            case "logout":
                action = new Logout();
                break;
            default:
                action = new ByDefault();
        }
        return action;
    }
}
