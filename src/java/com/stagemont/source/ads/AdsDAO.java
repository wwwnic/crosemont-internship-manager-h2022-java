/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.ads;

import com.stagemont.entities.Ads;
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
public class AdsDAO implements AdsSource {

    private static final String SQL_SELECT_BY_ID = "SELECT * FROM ads WHERE id = ?";
    
    private static final String SQL_SELECT_BY_COMPANY_ID = "SELECT * FROM ads WHERE company_id = ?";

    private static final String SQL_SELECT = "SELECT * FROM ads";

    private static final String SQL_INSERT = "INSERT INTO ads(title,description,image,company_id) value(?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE ads SET title = ?, description = ? image = ?, company_id = ? WHERE id = ?";

    private static final String SQL_DELETE = "DELETE FROM ads WHERE id = ?";

    @Override
    public Ads getAdsFromid(int id) {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Ads ads = new Ads(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getString("image"),
                        result.getInt("company_id")
                );
                ConnectionDB.closeConnection();
                return ads;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
            
            
    @Override
    public List<Ads> getAdsFromCompanyid(int company_id) {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_COMPANY_ID);
            ps.setInt(1, company_id);
            ResultSet result = ps.executeQuery();
            List<Ads> adsLst = new ArrayList();

            while (result.next()) {
                adsLst.add(new Ads(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getString("image"),
                        result.getInt("company_id")
                ));
            }
            ConnectionDB.closeConnection();
            return adsLst;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    @Override
    public List<Ads> getAllAds() {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);
            ResultSet result = ps.executeQuery();
            List<Ads> adsLst = new ArrayList();

            while (result.next()) {
                adsLst.add(new Ads(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getString("image"),
                        result.getInt("company_id")
                ));
            }
            ConnectionDB.closeConnection();
            return adsLst;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insertAds(Ads ads) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1, ads.getTitle());
            ps.setString(2, ads.getDescription());
            ps.setString(3, ads.getImage());
            ps.setInt(4, ads.getCompany_id());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean updateAds(Ads ads) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, ads.getTitle());
            ps.setString(2, ads.getDescription());
            ps.setString(3, ads.getImage());
            ps.setInt(4, ads.getCompany_id());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean deleteAds(int id) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

}
