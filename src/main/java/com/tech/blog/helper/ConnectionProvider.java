package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    // Make the method public so it can be accessed from outside the package
    public static Connection getConnection() {
        try {
            if (con == null) {
                // Load the driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create A Connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TechBlog", "root", "975647");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con; // Return the connection outside of the finally block
    }
}
