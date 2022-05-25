/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.job;

import com.stagemont.entities.Job;

/**
 *
 * @author melis
 */
public class TestJobDAO {
    
    public static void main(String[] args) {
        
        JobSource dao = new JobDAO();
        boolean result = false;
        
        System.out.println("******Test la méthode create*****");
        /*
        Job j = new Job
        (90, "un titre", "une desc", java.sql.Date.valueOf("2000-12-22"), java.sql.Date.valueOf("2021-12-23"), 2);
        
        result = dao.insertJob(j);
        System.out.println(result);
        
        */
        System.out.println("******Test la méthode update*****");

        /*
        Job j2 = new Job
        (6, "un titre2", "une desc2", java.sql.Date.valueOf("2000-12-22"), java.sql.Date.valueOf("2021-12-23"), 2);
        result = dao.updateJob(j2);
        System.out.println(result);
        */
        
        System.out.println("******Test la méthode delete*****");
        
        
        result = dao.deleteJob(6);
        System.out.println(result);
        
        
    }
    
}
