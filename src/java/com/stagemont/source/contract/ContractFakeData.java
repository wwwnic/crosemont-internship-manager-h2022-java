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
        
        Contract contract1 = new Contract(1, (new Date(2021,6,30)), (new Date(2021,8,30)), Status.SUBMIT, 1, 1);
        Contract contract2 = new Contract(2, (new Date(2022,1,11)), (new Date(2021,2,22)), Status.INTERVIEW, 1, 2);
        Contract contract3 = new Contract(3, (new Date(2000,5,05)), (new Date(2021,5,06)), Status.EMPLOY, 1, 3);

        listContract.add(contract1);
        listContract.add(contract2);
        listContract.add(contract3);
        
        
        return listContract;
    }
    
}
