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
    
}
