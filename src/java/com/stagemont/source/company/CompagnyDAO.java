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
    private static String SQL_INSERT = "insert into company(name, password, phone, email, person_in_charge) value(?,?,?,?,?)";
    private static String SQL_UPDATE = "update company set name = ?, password = ?, phone = ?, email = ?, person_in_charge = ? where id = ?";
    private static String SQL_DELETE = "delete from company where id = ?";

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

    @Override
    public boolean insertCompany(Company company) {
        boolean result = false;
        int nbLines = 0;
        PreparedStatement ps;
        
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);
            
            ps.setString(1, company.getName());
            ps.setString(2, company.getPassword());
            ps.setString(3, company.getPhone());
            ps.setString(4, company.getEmail());
            ps.setString(5, company.getPersonInCharge());
            
            nbLines = ps.executeUpdate();
            
            ConnectionDB.closeConnection();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CompagnyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(nbLines>0){
            result=true;
        }
        
        return result;
        
        
    }

    @Override
    public boolean deleteCompany(int id) {
        boolean result = false;
        int nbLines = 0;
        PreparedStatement ps;
        
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            
            
            nbLines = ps.executeUpdate();
            
            ConnectionDB.closeConnection();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CompagnyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(nbLines>0){
            result=true;
        }
        
        return result;
    }

    @Override
    public boolean updateCompany(Company company) {
        boolean result = false;
        int nbLines = 0;
        PreparedStatement ps;
        
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);
            
            ps.setString(1, company.getName());
            ps.setString(2, company.getPassword());
            ps.setString(3, company.getPhone());
            ps.setString(4, company.getEmail());
            ps.setString(5, company.getPersonInCharge());
            
            ps.setInt(6, company.getId());
            
            
            nbLines = ps.executeUpdate();
            
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CompagnyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(nbLines>0){
            result=true;
        }
        
        return result; 
    }

}
