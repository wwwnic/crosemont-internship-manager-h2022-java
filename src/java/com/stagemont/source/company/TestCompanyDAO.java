/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.company;

import com.stagemont.entities.Company;

/**
 *
 * @author melis
 */
public class TestCompanyDAO {
    
    public static void main(String[] args) {
        
        CompanySource dao = new CompanyDAO();
        boolean result=false;
        
        System.out.println("******Test la méthode create*****");
        Company company = new Company(7, "b", "b", "5142222626", "b@gmail.com", "B");
        result = dao.insertCompany(company);
        System.out.println(result);
        
        System.out.println("******Test la méthode delete*****");
        
//        result = dao.deleteCompany(10);
//        System.out.println(result);
        
        System.out.println("******Test la méthode update*****");
        
        //Company company = new Company(6, "b", "b", "5142222626", "b@gmail.com", "B");
       //result = dao.updateCompany(company);
       System.out.println(result);
        
        
        
    }
    
}
