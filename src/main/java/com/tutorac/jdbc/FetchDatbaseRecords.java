package com.tutorac.jdbc;

import java.sql.*;

public class FetchDatbaseRecords {
    public static void main(String[] args) {
//        String url = "jdbc:mysql://mysql-360ffc1d-time-series-data-mesh.h.aivencloud.com/ecomm?ssl-mode=REQUIRED&useSSL=true";
//        String username = "avnadmin";
//        String password = "AVNS_7h5wbullVDPSITsYYO0";

        String url = "jdbc:mysql://34.172.0.166:3306/ecomm_test";
        String username = "remote_user";
        String password = "strong_password";

        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM person");
            while(rs.next()) {
                System.out.println("Name : "+rs.getString("name"));
                System.out.println("Email : "+rs.getString("email"));
                System.out.println("Phone : "+rs.getString("phone"));
                System.out.println("--------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
