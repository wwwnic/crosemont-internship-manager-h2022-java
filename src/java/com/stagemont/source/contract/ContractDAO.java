/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.contract;

import com.stagemont.entities.Contract;
import com.stagemont.entities.Status;
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
public class ContractDAO implements ContractSource {

    private static String SQL_SELECT = "select * from contract";
    private static String SQL_SELECT_ID = "select * from contract where id = ?";
    private static String SQL_SELECT_BY_STUDENT_ID = "select * from contract where student_id = ?";
    private static String SQL_SELECT_BY_COMPANY_ID = "select * from contract where company_id = ?";
    private static String SQL_INSERT = "insert into contract(status, start_date, end_date, company_id, student_id) value(?,?,?,?,?)";
    private static String SQL_UPDATE = "update contract set status = ?, start_date = ?, end_date = ?, company_id = ?, student_id = ? where id = ?";
    private static String SQL_DELETE = "delete from contract where id = ?";

    @Override
    public List<Contract> getAllContract() {
        List<Contract> listContract = null;

        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);

            ResultSet result = ps.executeQuery();
            listContract = new ArrayList<>();
            while (result.next()) {
                Contract contract = new Contract();
                contract.setId(result.getInt("id"));
                contract.setStart_date(result.getDate("start_date"));
                contract.setEnd_date(result.getDate("end_date"));

                String status = (result.getString("status")).toUpperCase();
                Status statusEnum = Status.valueOf(status);
                contract.setStatus(statusEnum);

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
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_COMPANY_ID);
            ps.setInt(1, company_id);
            ResultSet result = ps.executeQuery();
            listContract = new ArrayList<>();
            while (result.next()) {
                Contract contract = new Contract();
                contract.setId(result.getInt("id"));
                contract.setStart_date(result.getDate("start_date"));
                contract.setEnd_date(result.getDate("end_date"));

                String status = (result.getString("status")).toUpperCase();
                Status statusEnum = Status.valueOf(status);
                contract.setStatus(statusEnum);

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
    public List<Contract> getContractByStudentId(int studentId) {
        List<Contract> listContract = null;

        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_STUDENT_ID);
            ps.setInt(1, studentId);
            ResultSet result = ps.executeQuery();
            listContract = new ArrayList<>();
            while (result.next()) {
                Contract contract = new Contract();
                contract.setId(result.getInt("id"));
                contract.setStart_date(result.getDate("start_date"));
                contract.setEnd_date(result.getDate("end_date"));

                String status = (result.getString("status")).toUpperCase();
                Status statusEnum = Status.valueOf(status);
                contract.setStatus(statusEnum);

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
    public boolean insertContract(Contract contract) {
        boolean result = false;
        int nbLines = 0;
        PreparedStatement ps;

        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1, contract.getStatus().toString());
            ps.setDate(2, new java.sql.Date(contract.getStart_date().getTime()));
            ps.setDate(3, new java.sql.Date(contract.getEnd_date().getTime()));
            ps.setInt(4, contract.getCompany_id());
            ps.setInt(5, contract.getStudent_id());

            nbLines = ps.executeUpdate();

            ConnectionDB.closeConnection();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ContractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (nbLines > 0) {
            result = true;
        }

        return result;
    }

    @Override
    public boolean deleteContract(int id) {
        boolean result = false;
        int nbLines = 0;
        PreparedStatement ps;

        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);

            nbLines = ps.executeUpdate();

            ConnectionDB.closeConnection();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ContractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (nbLines > 0) {
            result = true;
        }

        return result;

    }

    @Override
    public boolean updateContract(Contract contract) {
        boolean result = false;
        int nbLines = 0;
        PreparedStatement ps;

        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);

            //int id, Date start_date, Date end_date, Status status, int company_id, int student_id
            ps.setString(1, contract.getStatus().toString());
            ps.setDate(2, new java.sql.Date(contract.getStart_date().getTime()));
            ps.setDate(3, new java.sql.Date(contract.getEnd_date().getTime()));
            ps.setInt(4, contract.getCompany_id());
            ps.setInt(5, contract.getStudent_id());

            ps.setInt(6, contract.getId());

            nbLines = ps.executeUpdate();

            ConnectionDB.closeConnection();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ContractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (nbLines > 0) {
            result = true;
        }

        return result;

    }

}
