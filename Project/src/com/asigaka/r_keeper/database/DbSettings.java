package com.asigaka.r_keeper.database;

public class DbSettings {
    public static String DB_USERNAME;
    public static String DB_PASSWORD;
    public static String DB_HOST;
    public static String DB_PORT;
    public static String DB_URL;

    public static void FillSettings(String host, String port, String username, String password) {
        DB_USERNAME = username;
        DB_PASSWORD = password;
        DB_HOST = host;
        DB_PORT = port;
        DB_URL = "jdbc:postgresql://" + DB_HOST + ":" + DB_PORT + "/" + DB_USERNAME;
    }
}
