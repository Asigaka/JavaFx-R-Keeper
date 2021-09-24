package com.asigaka.r_keeper.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    public Connection GetConnection() {
        Connection connection = null;

        if (DbSettings.DB_URL != null) {
            try {
                connection = DriverManager.getConnection(DbSettings.DB_URL, DbSettings.DB_USERNAME, DbSettings.DB_PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
