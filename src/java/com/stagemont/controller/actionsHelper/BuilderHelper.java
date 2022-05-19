/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.actionsHelper;

import com.stagemont.controller.action.ByDefault;
import com.stagemont.controller.action.Login;
import com.stagemont.controller.action.Logout;
import com.stagemont.controller.action.teacher.DeleteStudent;
import com.stagemont.controller.action.teacher.EditStudent;
import com.stagemont.controller.action.teacher.ShowStudentDashboard;
import com.stagemont.controller.action.teacher.ShowStudentForm;
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
        }
        return action;
    }

    public static Action iterateActionTeacher(String actionToDo) {
        Action action = null;
        switch (actionToDo) {
            case "showStudentList":
                action = new ShowStudentList();
                break;
            case "showStudentForm":
                action = new ShowStudentForm();
                break;
            case "editStudent":
                action = new EditStudent();
                break;
            case "deleteStudent":
                action = new DeleteStudent();
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
            default:
                action = new ByDefault();
        }
        return action;
    }
}
