<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course table</title>
</head>
<body>
<h2>Courses Information</h2>
<%
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "root");
			Statement statement = con.createStatement();

			String QueryString = "SELECT * from course";
			ResultSet rs = statement.executeQuery(QueryString);
	%>
	<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
		<%
			while (rs.next()) {
		%>
		<TR>
			<TD><%=rs.getInt(1)%></TD>
			<TD><%=rs.getString(2)%></TD>
			<TD><%=rs.getString(3)%></TD>
			<TD><%=rs.getString(4)%></TD>
			<TD><%=rs.getString(5)%></TD>
			
		</TR>
		<%
			}
		%>
		<%
			// close all the connections.
				rs.close();
				statement.close();
				con.close();
			} catch (Exception ex) {
		%>
		</font>
		<font size="+3" color="red"></b> <%
 	System.out.println("Unable to connect to database.");
 	}
 %>
	</TABLE>
	<input type = "button" value = "Back" onclick = "javascript:history.go(-1)">
	</font>
</body>
</html>