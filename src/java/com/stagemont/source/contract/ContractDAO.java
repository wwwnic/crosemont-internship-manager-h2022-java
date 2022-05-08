/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.contract;

import com.stagemont.entities.Contract;
import com.stagemont.entities.Status;
import com.stagemont.service.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melis
 */
public class ContractDAO implements ContractSource {

    private static String SQL_SELECT = "select * from contract";
    private static String SQL_SELECT_ID = "select * from contract where company_id = ?";
    
    //CREATE UPDATE DELETE - CONTRACTS
    //signer/accepter candidat 
    
    
    @Override
    public List<Contract> getAllContract() {
        List<Contract> listContract = null;
        
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);
            
            ResultSet result = ps.executeQuery();
            listContract = new ArrayList<>();
            while(result.next()){
                Contract contract = new Contract();
                contract.setId(result.getInt("id"));
                contract.setStart_date(result.getDate("start_date"));
                contract.setEnd_date(result.getDate("end_date"));
                
                String status = (result.getString("status")).toUpperCase();
                Status statusEnum = Status.valueOf(status);
                contract.setStatus( statusEnum );
                
                contract.setCompany_id(result.getInt("company_id"));
                contract.setStudent_id(result.getInt("student_id"));
                
                listContract.add(contract);
            }
        
            ConnectionDB.closeConnection();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ContractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listContract;
        
    }

    @Override
    public List<Contract> getContractByComapnyId(int company_id) {
        List<Contract> listContract = null;
        
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_ID);
            ps.setInt(1, company_id);
            ResultSet result = ps.executeQuery();
            listContract = new ArrayList<>();
            while(result.next()){
                Contract contract = new Contract();
                contract.setId(result.getInt("id"));
                contract.setStart_date(result.getDate("start_date"));
                contract.setEnd_date(result.getDate("end_date"));
                
                String status = (result.getString("status")).toUpperCase();
                Status statusEnum = Status.valueOf(status);
                contract.setStatus( statusEnum );
                
                contract.setCompany_id(result.getInt("company_id"));
                contract.setStudent_id(result.getInt("student_id"));
                
                listContract.add(contract);
            }
        
            ConnectionDB.closeConnection();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ContractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listContract;
    }
    
}
