<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Feedback Summary</title> 
</head> 
<body> 

<%@ include file="header.jsp" %> 

<h3>Feedback Summary</h3> 

<p><strong>Name:</strong> ${param.studentName}</p> 

<c:if test="${not empty paramValues.facilities}"> 
    <p><strong>Facilities Feedback:</strong></p> 
    <ul> 
        <c:forEach var="facility" items="${paramValues.facilities}"> 
            <li> 
                ${facility} - 
                <c:choose> 
                    <c:when test="${facility == 'Library'}"> 
                        ${param.libraryComment} 
                    </c:when> 
                    <c:when test="${facility == 'Cafeteria'}"> 
                        ${param.cafeteriaComment} 
                    </c:when> 
                    <c:when test="${facility == 'Labs'}"> 
                        ${param.labsComment} 
                    </c:when> 
                    <c:when test="${facility == 'Ground'}"> 
                        ${param.groundComment} 
                    </c:when> 
                    <c:otherwise>No comments</c:otherwise> 
                </c:choose> 
            </li> 
        </c:forEach> 
    </ul> 
</c:if> 

<c:if test="${empty paramValues.facilities}"> 
    <p><em>No feedback submitted.</em></p> 
</c:if> 

<%@ include file="footer.jsp" %> 

</body> 
</html>
