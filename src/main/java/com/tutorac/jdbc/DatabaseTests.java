package com.tutorac.jdbc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.Properties;

public class DatabaseTests {

    String url = "jdbc:mysql://mysql-360ffc1d-time-series-data-mesh.h.aivencloud.com:20150/ecomm";
    String username = "avnadmin";
    String password = "AVNS_7h5wbullVDPSITsYYO0";
    String database = "ecomm";
    Connection connection;

    @BeforeMethod
    public void dbSetup() {
        Properties properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
        properties.setProperty("useSSL", "true");
        properties.setProperty("requireSSL", "true");
        properties.setProperty("verifyServerCertificte", "true");
        properties.setProperty("trustCertificateKeystoreUrl", "ca.pem");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test(dataProvider = "storedprocprovider")
    public void databaseStoredProcedureTest(String sql, String inParam, String outParam) {
        try{
            int inP = Integer.parseInt(inParam);
            int outP = Integer.parseInt(outParam);
            CallableStatement cstmt = connection.prepareCall(sql);
            cstmt.setInt(1, inP);
            cstmt.registerOutParameter(outP, Types.DECIMAL);
            cstmt.execute();
            float res = cstmt.getFloat(2);
            System.out.println(res); // PUT ASSERTIONS OR CHECKS!!
        }catch(Exception e) {
            e.printStackTrace();
        }
     }

     @DataProvider(name = "storedprocprovider")
     public String[][] databaseTestProvider() {
        return new String[][] {
                {"{call calculate_average_user_order_price(?, ?)}", "1", "2"},
                {"{call calculate_average_user_order_price(?, ?)}", "3", "2"}
        };
     }

    @AfterMethod
    public void closeDbConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
