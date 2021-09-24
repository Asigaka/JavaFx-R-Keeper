package com.asigaka.r_keeper.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHandler {
    private String db_host;
    private String db_port;
    private String db_username;
    private String db_password;
    private String db_url;

    public void FillSettings(String host, String port, String username, String password) {
        db_host = host;
        db_port = port;
        db_username = username;
        db_password = password;

        db_url = "jdbc:postgresql://" + host + ":" + port + "/" + username;
        System.out.println(db_url);
    }

    public Connection GetConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(db_url, db_username, db_password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public String getDb_url() {
        return db_url;
    }
}
