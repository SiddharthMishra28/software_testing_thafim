package com.tutorac.project.jdbcproject.service;

import com.tutorac.project.jdbcproject.config.DbConnection;
import com.tutorac.project.jdbcproject.models.Product;

import java.sql.*;

public class ProductService {

    private Connection connection;

    public ProductService() {
        this.connection = new DbConnection().getConnection();
    }

    public void createProduct(Product product) {
        String sql = "INSERT INTO products (name, description, price, stock_quantity) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, product.getName());
            pstmt.setString(2, product.getDescription());
            pstmt.setDouble(3, product.getPrice());
            pstmt.setInt(4, product.getStockQuantity());
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) {
                try(ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if(generatedKeys.next()) {
                        System.out.println("Product Created Successfully!");
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
