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
 * @author Nicolas Brunet
 */
public class CompanyInputUtil {

    private HttpServletRequest request;

    public CompanyInputUtil(HttpServletRequest request) {
        this.request = request;
    }

    public boolean isListContainsNull(List<String> lst) {
        return lst.contains(null);
    }

    public String getIdFromRequest() {
        return request.getParameter("id");
    }

    public String getNameFromRequest() {
        String name = request.getParameter("cname");
        boolean nameIsValid = InputValidator.isValidName(name);
        if (!nameIsValid) {
            return null;
        }
        return name;
    }

    public String getPhoneFromRequest() {
        String phone = request.getParameter("cphone");
        boolean phoneIsValid = InputValidator.isValidPhone(phone);
        if (!phoneIsValid) {
            return null;
        }
        return phone;
    }

    public String getEmailFromRequest() {
        String email = request.getParameter("email");
        boolean emailIsValid = InputValidator.isValidEmail(email);
        if (!emailIsValid) {
            return null;
        }
        return email;
    }

    public String getPersonInChargeFromRequest() {
        String perInCharge = request.getParameter("personInCharge");
        boolean perInChargeIsValid = InputValidator.isValidName(perInCharge);
        if (!perInChargeIsValid) {
            return null;
        }
        return perInCharge;
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
