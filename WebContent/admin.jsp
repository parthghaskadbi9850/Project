<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h2>
Welcome Admin!
</h2>
<hr>
<a href = "displayUsers.jsp">View Users</a><br>
<a href = "displayContacts.jsp">View Contacts</a><br>
<a href = "displayFeedback.jsp">View Feedback</a><br>
<a href = "displayCourses.jsp">View Courses</a><br>
<a href = "regcourse.jsp">Add Courses</a><br>

<form action = "index.jsp">
<input type = "submit" value = "Home">
</form>
</body>
</html>