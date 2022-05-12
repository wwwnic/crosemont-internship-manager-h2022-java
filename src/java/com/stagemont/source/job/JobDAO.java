/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.job;

import com.stagemont.entities.Job;
import com.stagemont.service.ConnectionDB;
import java.sql.Date;
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
public class JobDAO implements JobSource {
    
    private static final String SQL_SELECT = "SELECT * FROM job";

    private static final String SQL_SELECT_BY_ID = "SELECT * FROM job WHERE id = ?";

    private static final String SQL_INSERT = "INSERT INTO job(title,description,start_date,end_date,company_id) value(?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE job SET title = ?, description = ?, start_date = ? end_date = ?, company_id = ? WHERE id = ?";

    private static final String SQL_DELETE = "DELETE FROM job WHERE id = ?";

    @Override
    public List<Job> getAllJob() {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);
            ResultSet result = ps.executeQuery();
            List<Job> jobLst = new ArrayList();

            while (result.next()) {
                jobLst.add(new Job(
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
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Job getJobFromId(int id) {
         try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Job job = new Job(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getDate("start_date"),
                        result.getDate("end_date"),
                        result.getInt("company_id")
                );
                ConnectionDB.closeConnection();
                return job;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insertJob(Job job) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1, job.getTitle());
            ps.setString(2, job.getDescription());
            ps.setDate(3, (Date) job.getStart_date());
            ps.setDate(4, (Date) job.getEnd_date());
            ps.setInt(5, job.getCompany_id());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean updateJob(Job job) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, job.getTitle());
            ps.setString(2, job.getDescription());
            ps.setDate(3, (Date) job.getStart_date());
            ps.setDate(4, (Date) job.getEnd_date());
            ps.setInt(5, job.getCompany_id());
            ps.setInt(6, job.getId());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean deleteJob(int id) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            
            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }
    
}
