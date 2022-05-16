/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.contract;

import com.stagemont.entities.Contract;
import com.stagemont.entities.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author melis
 */
public class ContractFakeData implements ContractSource{
    

    @Override
    public List<Contract> getAllContract() {
        List<Contract> listContract = new ArrayList();
        
                
        Contract contract1 = new Contract(1, java.sql.Date.valueOf("2021-06-30"), java.sql.Date.valueOf("2021-08-30"), Status.SUBMIT, 1, 1);
        Contract contract2 = new Contract(2, java.sql.Date.valueOf("2022-01-11"), java.sql.Date.valueOf("2022-02-22"), Status.INTERVIEW, 1, 2);
        Contract contract3 = new Contract(3, java.sql.Date.valueOf("2021-05-05"), java.sql.Date.valueOf("2021-05-06"), Status.EMPLOY, 1, 3);

        listContract.add(contract1);
        listContract.add(contract2);
        listContract.add(contract3);
        
        
        return listContract;
    }

    @Override
    public List<Contract> getContractByComapnyId(int company_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertContract(Contract contract) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteContract(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateContract(Contract contract) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contract> getContractByStudentId(int student_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
