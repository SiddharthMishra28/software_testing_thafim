package com.tutorac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * <p>This class is a demo class for jdbc connection</p>
 */
public class ReadDbDataSecured {
    public static void main(String[] args) {
        String url = "jdbc:mysql://mysql-360ffc1d-time-series-data-mesh.h.aivencloud.com:20150/ecomm";
        String username = "avnadmin";
        String password = "AVNS_7h5wbullVDPSITsYYO0";
        String database = "ecomm";

        Properties properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
        properties.setProperty("useSSL", "true");
        properties.setProperty("requireSSL", "true");
        properties.setProperty("verifyServerCertificte", "true");
        properties.setProperty("trustCertificateKeystoreUrl", "ca.pem");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, properties);
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM products");
            while(results.next()) {
                System.out.println(results.getString("name"));
                System.out.println(results.getString("description"));
                System.out.println(results.getFloat("price"));
                System.out.println("-------------------------------");
            }
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
