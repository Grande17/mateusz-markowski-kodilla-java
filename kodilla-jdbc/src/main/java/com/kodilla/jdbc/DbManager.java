package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {
    INSTANCE;

    private Connection con;

    DbManager(){
        Properties prop = new Properties();
        prop.put("user", "kodilla_user");
        prop.put("password", "kodilla_Pass123");
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodilla_course" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",
                    prop);
        }catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DbManager getInstance(){
        return INSTANCE;
    }
    public Connection getConnection(){
        return con;

    }
}
