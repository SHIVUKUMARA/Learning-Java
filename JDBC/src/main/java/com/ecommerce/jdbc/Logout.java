package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Logout {

    private static int loggedInUserId = -1;
    private static Connection con;

    public static void setLoggedInUserId(int userId) {
        loggedInUserId = userId; 
    }

    private static Connection getConnection() {
        if (con == null) {
            con = ConfigurationFile.getConnection();
        }
        return con;
    }

    public static void userLogout() {
        if (loggedInUserId == -1) {
            System.out.println("No user is currently logged in.");
            return;
        }

        try {
            updateStatus(loggedInUserId, "inactive");
            loggedInUserId = -1;
            System.out.println("User logged out successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error occurred while logging out.");
        }
    }

    public static void updateStatus(int userId, String status) throws SQLException {
        String sql = "update user set status = ? where user_Id = ?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

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
}
