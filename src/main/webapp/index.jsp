<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Feedback System</title> 
</head> 
<body> 
<%@ include file="header.jsp" %> 

<h2>Welcome to the Feedback System</h2> 
<p>Please click the button below to give your feedback.</p> 

<form action="FeedbackForm.jsp" method="get"> 
    <input type="submit" value="Give Feedback"> 
</form> 

<%@ include file="footer.jsp" %> 
</body> 
</html> 
