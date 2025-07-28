<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Feedback</title>
</head>
<body>
    <h2>Student Course Feedback</h2>

    <% if (request.getAttribute("error") != null) { %>
        <p style="color:red;"><%= request.getAttribute("error") %></p>
    <% } %>

    <form action="submitFeedback" method="post">
        Name: <input type="text" name="name" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        Course Attended: <input type="text" name="course" required><br><br>
        Feedback: <textarea name="feedback" required></textarea><br><br>
        <input type="submit" value="Submit Feedback">
    </form>
</body>
</html>
