/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.pdf;

import com.stagemont.controller.actionsHelper.AbstractAction;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Brunet
 */
public class ShowPDF extends AbstractAction {

    private String getFileName() {
        String id = request.getParameter("id");
        String fileType = request.getParameter("fileType");
        String filename = "stu." + id + "_" + fileType + ".pdf";
        return filename;
    }

    @Override
    public String execute() {
        FileInputStream fileInputStream = null;
        OutputStream responseOutputStream = null;
        String filename = getFileName();
        String filePath = request.getServletContext().getRealPath("/pdf/") + filename;
        File file = new File(filePath);
        if (!file.exists()) {
            String id = request.getParameter("id");
            request.setAttribute("msgError", "Ce document n'est pas disponible");
            return "~showStudentDashboard?id=" + id;
        }
        try {
            String mimeType = request.getServletContext().getMimeType(filePath);
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }
            response.setContentType(mimeType);
            response.addHeader("application/pdf", "attachment; filename=" + filename);
            response.setContentLength((int) file.length());

            fileInputStream = new FileInputStream(file);
            responseOutputStream = response.getOutputStream();
            int bytes;
            while ((bytes = fileInputStream.read()) != -1) {
                responseOutputStream.write(bytes);
            }
        } catch (IOException ex) {
            Logger.getLogger(ShowPDF.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileInputStream.close();
                responseOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(ShowPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String id = request.getParameter("id");
        return "~showStudentDashboard?id=" + id;
    }
}
