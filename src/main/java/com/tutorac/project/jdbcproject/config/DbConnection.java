package com.tutorac.project.jdbcproject.config;

import java.sql.*;

public class DbConnection {

    private Connection connection;

    public DbConnection() {
        String url = "jdbc:mysql://34.172.0.166:3306/ecomm_test";
        String username = "remote_user";
        String password = "strong_password";
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
