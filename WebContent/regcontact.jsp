<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Registration</title>
</head>
<body>
<form action="regcontact" method="POST" >
     <pre>
     User ID     : <input type="number" name="id"/><br>
     Username    : <input type="text" name="name"/><br>
     Email       : <input type="email" name="email"/><br>
     Phone#      : <input type="number" name="phone"/><br>
     Message     : <input type="text" name="message"/><br>
     Contact ID  : <input type="number" name="contact_id"/><br>
                   <input type="submit" value="Register">
     </pre>
     </form>
</body>
</html>