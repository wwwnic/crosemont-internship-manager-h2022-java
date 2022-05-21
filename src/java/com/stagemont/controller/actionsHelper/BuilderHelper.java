/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.actionsHelper;

import com.stagemont.controller.action.ByDefault;
import com.stagemont.controller.action.Login;
import com.stagemont.controller.action.Logout;
import com.stagemont.controller.action.display.ShowCompanyDashboard;
import com.stagemont.controller.action.display.ShowCompanyForm;
import com.stagemont.controller.action.teacher.DeleteStudent;
import com.stagemont.controller.action.edit.EditStudent;
import com.stagemont.controller.action.display.ShowStudentDashboard;
import com.stagemont.controller.action.display.ShowStudentForm;
import com.stagemont.controller.action.student.ShowStudentHomepage;
import com.stagemont.controller.action.student.ShowStudentInfoJob;
import com.stagemont.controller.action.student.ShowStudentInfoStage;
import com.stagemont.controller.action.student.ShowStudentInternship;
import com.stagemont.controller.action.student.ShowStudentJobs;
import com.stagemont.controller.action.teacher.DeleteCompany;
import com.stagemont.controller.action.edit.EditCompany;
import com.stagemont.controller.action.teacher.ShowCompanyList;
import com.stagemont.controller.action.teacher.ShowStudentList;
import com.stagemont.controller.action.company.AddAds;
import com.stagemont.controller.action.company.AdsList;
import com.stagemont.controller.action.company.Contract;
import com.stagemont.controller.action.company.ContractList;
import com.stagemont.controller.action.company.Dashboard;

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
            case "contract":
                action = new Contract();
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
            case "test":
                action = new ByDefault();
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
            case "showStudentInfoJob":
                action = new ShowStudentInfoJob();
                break;
            case "showStudentInfoStage":
                action = new ShowStudentInfoStage();
                break;
            default:
                action = new ByDefault();
        }
        return action;
    }
}
