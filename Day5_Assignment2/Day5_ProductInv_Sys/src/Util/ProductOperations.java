package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductOperations {

    public void addProduct(int id, String name, int quantity, double price) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO products VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, quantity);
            pst.setDouble(4, price);

            int rows = pst.executeUpdate();
            System.out.println(rows + " product(s) added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listProducts() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM products";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("product_id") +
                                   ", Name: " + rs.getString("product_name") +
                                   ", Quantity: " + rs.getInt("quantity") +
                                   ", Price: " + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProductQuantity(int id, int newQty) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "UPDATE products SET quantity = ? WHERE product_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, newQty);
            pst.setInt(2, id);

            int rows = pst.executeUpdate();
            System.out.println(rows + " product(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "DELETE FROM products WHERE product_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rows = pst.executeUpdate();
            System.out.println(rows + " product(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
