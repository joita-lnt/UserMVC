<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lti.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% User u=(User)session.getAttribute("userById"); 
if(u!=null)
{
%>
<center>
<form method="post" action="http://localhost:9090/UserMVC/UDUserController">
 ID: <input type="number" name="id" width="100px" value="<%= u.getId() %>">
<br><br>

 Name: <input type="text" name="name" width="100px" value="<%= u.getName() %>">
<br><br>

 Email: <input type="text" name="email" width="100px" value="<%= u.getEmail() %>">
<br><br>


Password: <input type="password" name="password" width="100px" value="<%= u.getPassword() %>"> 
<br><br>

<input type="submit" name="button" value ="Update User" width="100px"><br><br>
<input type="submit" name="button" value ="Delete User" width="100px"><br><br>
<br><br>
</form>
</center>
<%
}
else
{
%>
<h1>No record found</h1>
<%
}
%>




</body>
</html>