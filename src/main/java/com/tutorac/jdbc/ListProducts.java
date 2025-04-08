package com.tutorac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListProducts {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://34.172.0.166:3306/ecomm_test";
        String userName = "remote_user";
        String password = "strong_password";

        String query = "SELECT * FROM users";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
            Statement stmt = connection.createStatement();
            ResultSet results = stmt.executeQuery(query);
            while(results.next()) {
                System.out.println("------------------");
                System.out.println("User ID "+results.getInt("user_id"));
                System.out.println("First Name : "+results.getString("first_name"));
                System.out.println("Last Name : "+results.getString("last_name"));
                System.out.println("Email : "+results.getString("email"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
