<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add feedback here</title>
</head>
<body>
<form action="feedback" method="POST" >
     <pre>
     User ID     : <input type="number" name="id"/><br>
     Username    : <input type="text" name="name"/><br>
     Email       : <input type="email" name="email"/><br>
     Feedback ID : <input type="number" name="f_id"/><br>
     Feedback    : <input type="text" name="feedback"/><br>
    
                   <input type="submit" value="Add Feedback">
     </pre>
     </form>
</body>
</html>