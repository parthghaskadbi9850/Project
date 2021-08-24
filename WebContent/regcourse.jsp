<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Registration</title>
</head>
<body>
<form action="regcourse" method="POST" >
     <pre>
     Course ID     : <input type="number" name="course_id"/><br>
     Course Name   : <input type="text" name="course_name"/><br>
     Description   : <input type="text" name="c_desc"/><br>
     Fees          : <input type="text" name="c_fees"/><br>
     Resources     : <input type="text" name="c_resources"/><br>
     
                     <input type="submit" value="Add Course">
     </pre>
</form>
</body>
</html>