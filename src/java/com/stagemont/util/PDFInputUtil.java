/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.util;

import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Brune
 */
public class PDFInputUtil {

    private HttpServletRequest request;

    public PDFInputUtil(HttpServletRequest request) {
        this.request = request;
    }

    private String convertStringToUtf8(String string) {
        return new String(string.getBytes(), StandardCharsets.UTF_8);
    }

    public String getTitleFromRequest() {
        String title = request.getParameter("titleText");
        return convertStringToUtf8(title);
    }

    public String getTextFromRequest() {
        String text = request.getParameter("cvText");
        return convertStringToUtf8(text);
    }
    
}
