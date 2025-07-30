<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Thankyou</title> 
</head> 
<body> 
<%@ include file="header.jsp" %> 

<h3>Thank You!</h3> 
<p>Thank you, <b>${param.name}</b>, for submitting your feedback.</p> 

<%@ include file="footer.jsp" %> 

</body> 
</html>
