package com.asigaka.r_keeper.database;

public class DbSettings {
    //Настройки по-умолчанию
    public static final String DB_DEFAULT_USERNAME = "postgres";
    public static final String DB_DEFAULT_DBNAME = "r_keeper_users";
    public static final String DB_DEFAULT_PASSWORD = "12345";
    public static final String DB_DEFAULT_HOST = "localhost";
    public static final String DB_DEFAULT_PORT = "5432";

    //Изменяемые настройки
    public static String DB_USERNAME;
    public static String Db_DBNAME;
    public static String DB_PASSWORD;
    public static String DB_HOST;
    public static String DB_PORT;
    public static String DB_URL;

    public static void FillSettings(String dbName, String host, String port, String username, String password) {
        Db_DBNAME = dbName;
        DB_USERNAME = username;
        DB_PASSWORD = password;
        DB_HOST = host;
        DB_PORT = port;
        DB_URL = "jdbc:postgresql://" + DB_HOST + ":" + DB_PORT + "/" + Db_DBNAME;
    }

    public static void FillDefaultSettings() {
        Db_DBNAME = DB_DEFAULT_DBNAME;
        DB_USERNAME = DB_DEFAULT_USERNAME;
        DB_PASSWORD = DB_DEFAULT_PASSWORD;
        DB_HOST = DB_DEFAULT_HOST;
        DB_PORT = DB_DEFAULT_PORT;
        DB_URL = "jdbc:postgresql://" + DB_HOST + ":" + DB_PORT + "/" + Db_DBNAME;
    }
}
