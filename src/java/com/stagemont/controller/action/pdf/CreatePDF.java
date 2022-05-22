package com.stagemont.controller.action.pdf;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.stagemont.controller.actionsHelper.AbstractAction;
import com.stagemont.util.PDFInputUtil;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Brunet
 */
public class CreatePDF extends AbstractAction {

    private static final Font FONT_TITLE = new Font(Font.TIMES_ROMAN, 28, Font.BOLD, Color.BLACK);
    private static final Font FONT_DEFAULT_TEXT = new Font(Font.TIMES_ROMAN, 18, Font.NORMAL, Color.BLACK);

    private String getFilePath() {
        File file = new File(request.getRealPath("pdf"));
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }

    private String getFileName() throws IOException {
        String type = "stu";
        String uid = request.getParameter("id");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String docName = request.getParameter("documentName");

        String fileName = type + "." + lname + "." + fname + uid + "_" + docName + ".pdf";
        return fileName;
    }

    private void buildPDF() {
        Document document = new Document();
        try {
            String fileName = getFileName();
            String filePath = getFilePath();
            PdfWriter.getInstance(document, new FileOutputStream(filePath + "\\" + fileName));

            document.open();

            PDFInputUtil inputUtil = new PDFInputUtil(request);

            String titleText = inputUtil.getTitleFromRequest();
            String cvText = inputUtil.getTextFromRequest();

            Paragraph title = new Paragraph(titleText, FONT_TITLE);
            Paragraph lineJump = new Paragraph(" ", FONT_DEFAULT_TEXT);
            Paragraph para = new Paragraph(cvText, FONT_DEFAULT_TEXT);

            document.add(title);
            document.add(lineJump);
            document.add(para);

        } catch (DocumentException | IOException ex) {
            Logger.getLogger(CreatePDF.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("msgError", "Échec de creation du PDF");
        }
        document.close();
    }

    @Override
    public String execute() {
        buildPDF();
        return "~showStudentDashboard";
    }
}
