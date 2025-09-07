package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cart {

    private static Connection con;
    private static int loggedInUserId;

    private static Connection getConnection() {
        if (con == null) {
            con = ConfigurationFile.getConnection();
        }
        return con;
    }

    public static void setLoggedInUserId(int userId) {
        loggedInUserId = userId;
    }

    public static void CartTable() throws SQLException {
        String sql = "create table if not exists cart (" +
                     "item_Id int auto_increment primary key, " +
                     "user_Id int not null, " +
                     "product_Id int not null, " +
                     "item_Quantity int not null, " +
                     "item_price decimal(10,2) not null, " +
                     "foreign key (user_Id) references user(user_Id), " +
                     "foreign key (product_Id) references product(product_Id)" +
                     ")";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.executeUpdate();
            System.out.println("Cart table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to create cart table.");
        }
    }

    public static void addItemToCart(Scanner sc) throws SQLException {
        if (loggedInUserId == -1) {
            System.out.println("No user is logged in.");
            return;
        }
        System.out.println("Logged in User ID: " + loggedInUserId);

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int requestedQuantity = sc.nextInt();

        String checkProductSQL = "select product_quantity, product_price from product where product_Id = ?";
        try (PreparedStatement checkStmt = getConnection().prepareStatement(checkProductSQL)) {
            checkStmt.setInt(1, productId);
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    int availableQuantity = rs.getInt("product_quantity");
                    double productPrice = rs.getDouble("product_price");

                    if (requestedQuantity > availableQuantity) {
                        System.out.println("Items not available. Available quantity: " + availableQuantity);
                        return;
                    }
                    double totalPrice = requestedQuantity * productPrice;

                    String addToCartSQL = "insert into cart (user_Id, product_Id, item_Quantity, item_price) values (?, ?, ?, ?)";
                    try (PreparedStatement cartStmt = getConnection().prepareStatement(addToCartSQL)) {
                        cartStmt.setInt(1, loggedInUserId);
                        cartStmt.setInt(2, productId);
                        cartStmt.setInt(3, requestedQuantity);
                        cartStmt.setDouble(4, totalPrice);

                        int rowsInserted = cartStmt.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Item added to cart successfully.");

                            String updateProductSQL = "update product set product_quantity = product_quantity - ? where product_Id = ?";
                            try (PreparedStatement updateStmt = getConnection().prepareStatement(updateProductSQL)) {
                                updateStmt.setInt(1, requestedQuantity);
                                updateStmt.setInt(2, productId);
                                int rowsUpdated = updateStmt.executeUpdate();
                                if (rowsUpdated > 0) {
                                    System.out.println("Product quantity updated successfully.");
                                } else {
                                    System.out.println("Failed to update product quantity.");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Product not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to add item to cart.");
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        CartTable();
        addItemToCart(sc);
    }
}
