/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.contract;

import com.stagemont.entities.Contract;
import com.stagemont.entities.Status;
import java.util.Date;

/**
 *
 * @author melis
 */
public class TestContractDAO {

    public static void main(String[] args) {

        ContractSource dao = new ContractDAO();
        boolean result = false;

        System.out.println("******Test la méthode create*****");
        String pattern = "MM/dd/yyyy";
        

//        Contract c = new Contract(12, java.sql.Date.valueOf("2000-05-05"), java.sql.Date.valueOf("2021-05-06"), Status.EMPLOY, 1, 3);
//        result = dao.insertContract(c);
//        System.out.println(result);

        System.out.println("******Test la méthode delete*****");

        result = dao.deleteContract(12);
        result = dao.deleteContract(13);
        result = dao.deleteContract(14);
        System.out.println(result);
        System.out.println("******Test la méthode update*****");

        Contract c2 = new Contract (15, java.sql.Date.valueOf("2030-01-01"), java.sql.Date.valueOf("2030-10-30"), Status.INTERVIEW, 1, 3);
        result = dao.updateContract(c2);
        System.out.println(result);

    }

}
