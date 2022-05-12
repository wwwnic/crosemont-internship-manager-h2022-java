/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author melis
 */
public class TestBDRequeteSelect {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        String sql = "select * from company";

        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            //Optionnel : Renvoyer un booléen qui indique 
            //si la position courante du curseur se trouve
            //avant la première ligne
            if (result.isBeforeFirst()) {
                //La méthode next() pour se déplacer sur le suivant
                while (result.next()) {
                    System.out.println(result.getString("name"));
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ConnectionDB.closeConnection();

    }
    
}
