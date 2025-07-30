<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Feedback Form</title> 
</head> 
<body> 

<%@ include file="header.jsp" %> 

<h3>Student Feedback Form</h3> 

<form action="FeedbackSummary.jsp" method="post"> 

    <label>Student Name:</label> 
    <input type="text" name="studentName" required /> 
    <br><br> 

    <p>Select the facilities you want to give feedback on and provide your comments:</p> 

    <label><input type="checkbox" name="facilities" value="Library" /> Library</label><br> 
    <textarea name="libraryComment" rows="2" cols="40" placeholder="Comments on Library"></textarea><br><br> 

    <label><input type="checkbox" name="facilities" value="Cafeteria" /> Cafeteria</label><br> 
    <textarea name="cafeteriaComment" rows="2" cols="40" placeholder="Comments on Cafeteria"></textarea><br><br> 

    <label><input type="checkbox" name="facilities" value="Labs" /> Labs</label><br> 
    <textarea name="labsComment" rows="2" cols="40" placeholder="Comments on Labs"></textarea><br><br> 

    <label><input type="checkbox" name="facilities" value="Ground" />Ground</label><br> 
    <textarea name="Ground" rows="2" cols="40" placeholder="Comments on Ground"></textarea><br><br> 

    <input type="submit" value="Submit Feedback" /> 

</form> 

<%@ include file="footer.jsp" %> 

</body> 
</html>
