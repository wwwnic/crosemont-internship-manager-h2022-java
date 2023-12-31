/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.contract;

import com.stagemont.entities.Contract;
import java.util.List;

/**
 *
 * @author melis
 */
public interface ContractSource {

    public List<Contract> getAllContract();
    
    public Contract getContractById(int id);

    public List<Contract> getContractByComapnyId(int company_id);

    public List<Contract> getContractByStudentId(int student_id);

    public boolean insertContract(Contract contract);

    public boolean deleteContract(int id);

    public boolean updateContract(Contract contract);

}
