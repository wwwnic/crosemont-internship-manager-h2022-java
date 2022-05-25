/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.internship;

import com.stagemont.entities.Internship;
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
public class InternshipDAO implements InternshipSource {

    private static final String SQL_SELECT = "SELECT * FROM internship";

    private static final String SQL_SELECT_BY_ID = "SELECT * FROM internship WHERE id = ?";

    private static final String SQL_INSERT = "INSERT INTO internship(title,description,start_date,end_date,company_id) value(?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE internship SET title = ?, description = ?, start_date = ?, end_date = ?, company_id = ? WHERE id = ?";

    private static final String SQL_DELETE = "DELETE FROM internship WHERE id = ?";
    
    @Override
    public List<Internship> getAllInternship() {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);
            ResultSet result = ps.executeQuery();
            List<Internship> jobLst = new ArrayList();

            while (result.next()) {
                jobLst.add(new Internship(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getDate("start_date"),
                        result.getDate("end_date"),
                        result.getInt("company_id")
                ));
            }
            ConnectionDB.closeConnection();
            return jobLst;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(InternshipDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Internship getInternshipFromId(int id) {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Internship internship = new Internship(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getDate("start_date"),
                        result.getDate("end_date"),
                        result.getInt("company_id")
                );
                ConnectionDB.closeConnection();
                return internship;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(InternshipDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insertInternship(Internship internship) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1, internship.getTitle());
            ps.setString(2, internship.getDescription());
            ps.setDate(3, new java.sql.Date(internship.getStart_date().getTime()));
            ps.setDate(4, new java.sql.Date(internship.getEnd_date().getTime()));
            ps.setInt(5, internship.getCompany_id());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(InternshipDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean updateInternship(Internship internship) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, internship.getTitle());
            ps.setString(2, internship.getDescription());
            ps.setDate(3, new java.sql.Date(internship.getStart_date().getTime()));
            ps.setDate(4, new java.sql.Date(internship.getEnd_date().getTime()));
            ps.setInt(5, internship.getCompany_id());
            ps.setInt(6, internship.getId());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(InternshipDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean deleteInternship(int id) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            
            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(InternshipDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }
    
}
