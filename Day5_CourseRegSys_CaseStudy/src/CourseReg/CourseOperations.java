package CourseReg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseOperations {
	
	//Add Course
	public void addCourse(int id, String name, String faculty, int credits) {
	    try (Connection con = DBConnection.getConnection()) {
	        String sql = "INSERT INTO courses VALUES (?, ?, ?, ?)";
	        PreparedStatement pst = con.prepareStatement(sql);
	        pst.setInt(1, id);
	        pst.setString(2, name);
	        pst.setString(3, faculty);
	        pst.setInt(4, credits);

	        int rows = pst.executeUpdate();
	        System.out.println(rows + " course(s) added.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	//Select Course
	public void listCourses() {
	    try (Connection con = DBConnection.getConnection()) {
	        String sql = "SELECT * FROM courses";
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            System.out.println("ID: " + rs.getInt("course_id") +
	                               ", Name: " + rs.getString("course_name") +
	                               ", Faculty: " + rs.getString("faculty") +
	                               ", Credits: " + rs.getInt("credits"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	//Update
	public void updateCourse(int id, String newFaculty, int newCredits) {
	    try (Connection con = DBConnection.getConnection()) {
	        String sql = "UPDATE courses SET faculty = ?, credits = ? WHERE course_id = ?";
	        PreparedStatement pst = con.prepareStatement(sql);
	        pst.setString(1, newFaculty);
	        pst.setInt(2, newCredits);
	        pst.setInt(3, id);

	        int rows = pst.executeUpdate();
	        System.out.println(rows + " course(s) updated.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	//Remove Course
	public void deleteCourse(int id) {
	    try (Connection con = DBConnection.getConnection()) {
	        String sql = "DELETE FROM courses WHERE course_id = ?";
	        PreparedStatement pst = con.prepareStatement(sql);
	        pst.setInt(1, id);

	        int rows = pst.executeUpdate();
	        System.out.println(rows + " course(s) deleted.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}
