package com.stagemont.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nicolas Brunet
 */
public class ConnectionDB implements ConfigDB {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(ConfigDB.DRIVER);
        connection = DriverManager.getConnection(ConfigDB.URL, ConfigDB.USER, ConfigDB.PASSWORD);
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
