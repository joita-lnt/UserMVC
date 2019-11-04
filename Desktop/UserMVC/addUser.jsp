<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="http://localhost:9090/UserMVC/AddUserController">
Enter your ID: <input type="number" name="id" width="100px">
<br><br>

Enter your Name: <input type="text" name="name" width="100px">
<br><br>

Enter your Email: <input type="text" name="email" width="100px">
<br><br>


Enter your Password: <input type="password" name="password" width="100px">
<br><br>

<input type="submit" value ="Add User" width="100px">
<br><br>
</form>
</center>





</body>
</html>