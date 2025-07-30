package Util;


import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/productinv_sys";
        String user = "root"; 
        String password = "Nikhitha@123"; 

        return DriverManager.getConnection(url, user, password);
    }
}
