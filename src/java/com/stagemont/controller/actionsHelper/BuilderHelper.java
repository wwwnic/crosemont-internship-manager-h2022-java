/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.actionsHelper;

import com.stagemont.controller.action.ByDefault;
import com.stagemont.controller.action.Login;
import com.stagemont.controller.action.Logout;
import com.stagemont.controller.action.admin.ShowInternshipAdminList;
import com.stagemont.controller.action.admin.ShowJobAdminList;
import com.stagemont.controller.action.display.dashboard.ShowCompanyDashboard;
import com.stagemont.controller.action.display.form.ShowCompanyForm;
import com.stagemont.controller.action.edit.delete.DeleteStudent;
import com.stagemont.controller.action.edit.edit.EditStudent;
import com.stagemont.controller.action.display.dashboard.ShowStudentDashboard;
import com.stagemont.controller.action.display.dashboard.ShowTeacherDashboard;
import com.stagemont.controller.action.admin.ShowAddUserForm;
import com.stagemont.controller.action.admin.ShowHomepage;
import com.stagemont.controller.action.company.AddAds;
import com.stagemont.controller.action.company.AdsList;
import com.stagemont.controller.action.company.ContractList;
import com.stagemont.controller.action.company.Dashboard;
import com.stagemont.controller.action.display.dashboard.ShowInternshipDashboard;
import com.stagemont.controller.action.display.form.ShowStudentForm;
import com.stagemont.controller.action.display.form.ShowTeacherForm;
import com.stagemont.controller.action.display.dashboard.ShowJobDashboard;
import com.stagemont.controller.action.display.list.ShowInternshipList;
import com.stagemont.controller.action.display.list.ShowJobsList;
import com.stagemont.controller.action.edit.delete.DeleteCompany;
import com.stagemont.controller.action.edit.edit.EditCompany;
import com.stagemont.controller.action.display.list.ShowCompanyList;
import com.stagemont.controller.action.display.list.ShowStudentList;
import com.stagemont.controller.action.display.list.ShowTeacherList;
import com.stagemont.controller.action.edit.add.AddCompany;
import com.stagemont.controller.action.edit.add.AddStudent;
import com.stagemont.controller.action.edit.add.AddTeacher;
import com.stagemont.controller.action.edit.delete.DeleteTeacher;
import com.stagemont.controller.action.edit.edit.EditTeacher;

/**
 *
 * @author Brune
 */
public interface BuilderHelper {

    public static Action iterateActionStudent(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "showStudentJobs":
                action = new ShowJobsList();
                break;
            case "showStudentInternship":
                action = new ShowInternshipList();
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
            case "showJobDashboard":
                action = new ShowJobDashboard();
                break;
            case "showCompanyDashboard":
                action = new ShowCompanyDashboard();
                break;
            case "showJobsList":
                action = new ShowJobsList();
                break;
            case "showInternshipList":
                action = new ShowInternshipList();
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
            case "addAdsForm":
                action = new AddAds();
                break;
            case "adsList":
                action = new AdsList();
                break;
            case "contractList":
                action = new ContractList();
                break;
            case "dashboard":
                action = new Dashboard();
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
            case "showTeacherForm":
                action = new ShowTeacherForm();
                break;
            case "showCompanyForm":
                action = new ShowCompanyForm();
                break;
            case "addStudent":
                action = new AddStudent();
                break;
            case "addTeacher":
                action = new AddTeacher();
                break;
            case "addCompany":
                action = new AddCompany();
                break;
            case "editStudent":
                action = new EditStudent();
                break;
            case "editTeacher":
                action = new EditTeacher();
                break;
            case "editCompany":
                action = new EditCompany();
                break;
            case "deleteStudent":
                action = new DeleteStudent();
                break;
            case "deleteTeacher":
                action = new DeleteTeacher();
                break;
            case "deleteCompany":
                action = new DeleteCompany();
                break;
            case "showStudentDashboard":
                action = new ShowStudentDashboard();
                break;
            case "showTeacherDashboard":
                action = new ShowTeacherDashboard();
                break;
            case "showCompanyDashboard":
                action = new ShowCompanyDashboard();
                break;
            case "showStudentInfoJob":
                action = new ShowJobDashboard();
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
            case "showHomepage":
                action = new ShowHomepage();
                break;
            case "login":
                action = new Login();
                break;
            case "logout":
                action = new Logout();
                break;
            case "showStudentInfoJob":
                action = new ShowJobDashboard();
                break;
            case "showStudentInfoStage":
                action = new ShowInternshipDashboard();
                break;
            default:
                action = new ShowHomepage();
        }
        return action;
    }
}
