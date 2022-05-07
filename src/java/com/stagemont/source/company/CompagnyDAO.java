package com.stagemont.source.company;

import com.stagemont.entities.Company;
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
 * @author Nicolas Brunet
 */
public class CompagnyDAO implements CompanySource {

    private static String SQL_SELECT = "select * from company";
    private static String SQL_SELECT_ID = "select * from company where id = ?";

    @Override
    public List<Company> getAllCompany() {

        List<Company> listCompany = null;

        try {
            
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);

            ResultSet result = ps.executeQuery();
            listCompany = new ArrayList<>();
            while(result.next()){
                Company company = new Company();
                company.setId(result.getInt("id"));
                company.setName(result.getString("name"));
                company.setPhone(result.getString("phone"));
                company.setEmail(result.getString("email"));
                company.setPersonInCharge(result.getString("person_in_charge"));
                
                listCompany.add(company);
            }
            
            ConnectionDB.closeConnection();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CompagnyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listCompany;

    }

    @Override
    public Company getCompanyFromId(int id) {
        
        Company company = null;

        try {
            
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_ID);
            ps.setInt(1, (int) id);
            ResultSet result = ps.executeQuery();
            company = new Company();
            while(result.next()){
                company.setId(result.getInt("id"));
                company.setName(result.getString("name"));
                company.setPhone(result.getString("phone"));
                company.setEmail(result.getString("email"));
                company.setPersonInCharge(result.getString("person_in_charge"));
            }
            
            
            
            ConnectionDB.closeConnection();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CompagnyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return company;
    }

}
