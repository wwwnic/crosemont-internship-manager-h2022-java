/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action;

import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.entities.User;
import com.stagemont.source.company.CompanyDAO;
import com.stagemont.source.company.CompanySource;
import com.stagemont.source.student.StudentDAO;
import com.stagemont.source.student.StudentSource;
import com.stagemont.source.teacher.TeacherDAO;
import com.stagemont.source.teacher.TeacherSource;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas Brunet
 */
public class Login extends AbstractAction {

    private final String SPLIT_CHARACTER = "=";

    private final List<String> LST_STUDENT_PREFIX = Arrays.asList("etu", "stu");
    private final List<String> LST_TEACHER_PREFIX = Arrays.asList("pro", "ens", "tea");
    private final List<String> LST_COMPANY_PREFIX = Arrays.asList("ent", "com", "ent");

    private final StudentSource SOURCE_STUDENT = new StudentDAO();
    private final TeacherSource SOURCE_TEACHER = new TeacherDAO();
    private final CompanySource SOURCE_COMPANY = new CompanyDAO();

    private String getUserType(String username) {
        String[] userInfo = username.split(SPLIT_CHARACTER);
        return userInfo[0];
    }

    private String getFirstName(String username) {
        String[] userInfo = username.split(SPLIT_CHARACTER);
        String[] firstNameAndId = userInfo[1].split("\\d+", 2);
        return firstNameAndId[0].trim();
    }

    private int getUserId(String username) {
        String[] arr = username.split("\\d+", 2);
        String beforeInt = arr[0].trim();
        String intAndAfter = username.substring(beforeInt.length()).trim();
        int userId = -1;
        try {
            userId = Integer.parseInt(intAndAfter);
        } catch (NumberFormatException ex) {
            sendErrorMessage();
        }
        return userId;
    }

    private void sendErrorMessage() {
        request.setAttribute("msgError", "Nom ou mot de passe invalide");
    }

    private void setSession(User user) {
        HttpSession session = request.getSession();
        session.setAttribute("id", user.getId());
        session.setAttribute("name", user.getFirstname());
    }

    private User getUserInDataBase(String username, String password) {
        String userPrefix = getUserType(username);
        String fname = getFirstName(username);
        int userId = getUserId(username);
        if (LST_STUDENT_PREFIX.contains(userPrefix)) {
            return SOURCE_STUDENT.loginStudent(userId, fname, password);
        } else if (LST_TEACHER_PREFIX.contains(userPrefix)) {
            return SOURCE_TEACHER.loginTeacher(userId, fname, password);
        } else if (LST_COMPANY_PREFIX.contains(userPrefix)) {
            return SOURCE_COMPANY.loginCompany(userId, fname, password);
        } else {
            return null;
        }
    }

    private String getUserHomePage(User user) {
        return user.getUserTypeName() + "/homepage";
    }

    @Override
    public String execute() {
        try {
            String username = request.getParameter("uid");
            String password = request.getParameter("pw");
            User user = getUserInDataBase(username, password);
            String nextView;
            if (user != null) {
                setSession(user);
                nextView = getUserHomePage(user);
            } else {
                sendErrorMessage();
                nextView = "login";
            }
            return nextView;
        } catch (Exception e) {
            sendErrorMessage();
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
            return "login";
        }
    }
}
