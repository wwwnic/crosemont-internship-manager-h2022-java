/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.internship;

import com.stagemont.entities.Internship;

/**
 *
 * @author melis
 */
public class TestInternshipDAO {
    
    public static void main(String[] args) {
        
        InternshipSource dao = new InternshipDAO();
        boolean result = false;
        
        System.out.println("******Test la méthode create*****");
        /*
        Internship i = new Internship
        (90, "un titre", "une desc", java.sql.Date.valueOf("2000-12-22"), java.sql.Date.valueOf("2021-12-23"), 2);
        
        result = dao.insertInternship(i);
        System.out.println(result);
        */
        
        System.out.println("******Test la méthode update*****");

        /*
        Internship i2 = new Internship
        (6, "un titre2", "une desc2", java.sql.Date.valueOf("2000-12-22"), java.sql.Date.valueOf("2021-12-23"), 2);
        result = dao.updateInternship(i2);
        System.out.println(result);
        */
        
        System.out.println("******Test la méthode delete*****");
        
        result = dao.deleteInternship(6);
        System.out.println(result);
        
        
    }
    
}
