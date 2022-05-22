/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.controller.action.pdf;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.stagemont.controller.actionsHelper.AbstractAction;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Brunet
 */
public class CreatePdf extends AbstractAction {

    private String getFilePath() {
        File file = new File(request.getRealPath("pdf"));
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }

    private String getFileName() throws IOException {
        String type = "stu";
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String uid = request.getParameter("id");
        String fileName = type + "_" + lname + "." + fname + uid + ".pdf";
        return fileName;
    }

    @Override
    public String execute() {
        Document document = new Document();
        try {
            String fileName = getFileName();
            String filePath = getFilePath();
            PdfWriter.getInstance(document, new FileOutputStream(filePath + "\\" + fileName));
            document.open();
            
            Font titleFont = new Font(Font.TIMES_ROMAN, 30, Font.BOLD, Color.BLACK);
            Font font = new Font(Font.TIMES_ROMAN, 24, Font.NORMAL, Color.BLACK);
            String cvText = request.getParameter("cvText");
            
            Paragraph title = new Paragraph("Votre CV :", titleFont);
            Paragraph para = new Paragraph(cvText, font);
            
            document.add(title);
            document.add(para);
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(CreatePdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.close();
        return "homepage";
    }
}
