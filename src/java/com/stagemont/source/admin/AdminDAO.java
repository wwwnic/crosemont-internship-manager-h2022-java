package com.stagemont.source.admin;

import com.stagemont.entities.Admin;
import com.stagemont.source.teacher.*;
import com.stagemont.entities.Teacher;
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
public class AdminDAO implements AdminSource {

    private static final String SQL_LOGIN = "SELECT * FROM admin WHERE id = ? AND username = ? AND password = BINARY ?";

    @Override
    public Admin loginAdmin(int id, String username, String password) {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_LOGIN);
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, password);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Admin admin = new Admin(
                        result.getInt("id"),
                        result.getString("username"),
                        result.getString("password")
                );
                ConnectionDB.closeConnection();
                return admin;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
