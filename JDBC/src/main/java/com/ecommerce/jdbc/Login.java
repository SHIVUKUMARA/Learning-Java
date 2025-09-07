package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

    private static Connection con;

    private static Connection getConnection() {
        if (con == null) {
            con = ConfigurationFile.getConnection();
        }
        return con;
    }

    public static void userLogin(Scanner sc) throws InterruptedException, SQLException {
        String email;
        String password;
        String status;

        while (true) {
            System.out.print("Enter your Email: ");
            email = sc.nextLine().trim();
            if (!email.isEmpty()) {
                break;
            }
            System.out.println("Email can't be empty!!!");
        }

        while (true) {
            System.out.print("Enter your Password: ");
            password = sc.nextLine();
            if (!password.isEmpty()) {
                break;
            }
            System.out.println("Password can't be empty!!!");
        }

        String sql = "select * from user where Email = ? and Password = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    status = rs.getString("status");
                    int loggedInUserId = rs.getInt("user_Id");
                    if ("inactive".equals(status)) {
                        updateStatus(loggedInUserId, "active");
                    }
                    Logout.setLoggedInUserId(loggedInUserId);
                    Cart.setLoggedInUserId(loggedInUserId);

                    Thread.sleep(2000);
                    System.out.println("User Login Successful");
                    System.out.println("Wellcome to E-Commerce application");

                    loggedInMenu(sc);
                } else {
                    System.out.println("Invalid Email or Password. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStatus(int userId, String status) throws SQLException {
        String sql = "update user set status = ? where user_Id = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, status);
            stmt.setInt(2, userId);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("User status updated to " + status);
            } else {
                System.out.println("Failed to update user status.");
            }
        }
    }

    public static void loggedInMenu(Scanner sc) throws SQLException {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n====== Product Management Menu ======");
            System.out.println("3. Create Product Table");
            System.out.println("4. Update Product");
            System.out.println("5. View All Products");
            System.out.println("6. View Product by ID");
            System.out.println("7. View Items by Category");
            System.out.println("8. Delete Product");
            System.out.println("9. Logout");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 3:
                    CreateProduct.insertproductTable(sc);
                    break;
                case 4:
                    UpdateProduct.updateProducts(sc);
                    break;
                case 5:
                    GetProducts.getProducts();
                    break;
                case 6:
                    GetProductById.getProductById(sc);
                    break;
                case 7:
                    GetItemsByCategory.getItemByCategory(sc);
                    break;
                case 8:
                    DeleteProduct.deleteProduct(sc);
                    break;
                case 9:
                    Logout.userLogout();
                    exit = true;
                    break;
                case 0:
                    System.out.println("Exited the system.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
