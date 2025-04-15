package com.tutorac.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Properties;

public class InvokeStoredProcedureDemo {
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

        String sql = "{call calculate_average_user_order_price(?, ?)}";
        float avg_price = 0.0f;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, properties);
            CallableStatement cstmt = connection.prepareCall(sql);
            cstmt.setInt(1, 2);
            cstmt.registerOutParameter(2, Types.DECIMAL);
            cstmt.execute();
            avg_price = cstmt.getFloat(2);
            System.out.println(avg_price);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
