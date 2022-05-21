/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.util;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Brune
 */
public class TeacherInputUtil {

    private HttpServletRequest request;

    public TeacherInputUtil(HttpServletRequest request) {
        this.request = request;
    }

    public boolean isListContainsNull(List<String> lst) {
        return lst.contains(null);
    }

    public String getIdFromRequest() {
        return request.getParameter("id");
    }

    public String getFirstNameFromRequest() {
        String firstName = request.getParameter("fname");
        boolean nameIsValid = InputValidator.isValidName(firstName);
        if (!nameIsValid) {
            return null;
        }
        firstName = firstName.toLowerCase();
        String upperCaseFirstLetter = firstName.substring(0, 1).toUpperCase();
        String restOfTheName = firstName.substring(1);
        String capFirstName = upperCaseFirstLetter + restOfTheName;
        return capFirstName;
    }

    public String getLastNameFromRequest() {
        String lastName = request.getParameter("lname");
        boolean nameIsValid = InputValidator.isValidName(lastName);
        if (!nameIsValid) {
            return null;
        }
        lastName = lastName.toLowerCase();
        String upperCaseFirstLetter = lastName.substring(0, 1).toUpperCase();
        String restOfTheName = lastName.substring(1);
        String capLastName = upperCaseFirstLetter + restOfTheName;
        return capLastName;
    }

    public String getPasswordFromRequest() {
        String password = request.getParameter("password");
        boolean pwIsValid = InputValidator.isValidPassword(password);
        if (!pwIsValid) {
            return null;
        }
        return password;
    }
}
