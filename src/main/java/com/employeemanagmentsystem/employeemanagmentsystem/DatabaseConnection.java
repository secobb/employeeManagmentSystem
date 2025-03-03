package com.employeemanagmentsystem.employeemanagmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection(){
        String dbName = "employee";
        String dbUser = "root";
        String dbPassword = "root";
        String url = "jdbc:mysql://localhost/" + dbName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, dbUser, dbPassword);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return databaseLink;
    }
}
