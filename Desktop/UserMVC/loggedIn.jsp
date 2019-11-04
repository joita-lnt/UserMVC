<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lti.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	User u=(User)session.getAttribute("user");
%>

<center>
<br><br>
		<a href="addUser.jsp">Add a User</a>
		
		<br><br>
		
		<a href="http://localhost:9090/UserMVC/FetchAllUsers">Show Users</a>
		
		<br><br>
		
		<h2>Your Profile</h2>
Id: <%= u.getId()%>
<br><br>

Email: <%= u.getEmail()%>
<br><br>

Password: <%= u.getPassword()%>
<br><br>

Name: <%= u.getName()%>
<br><br>
<br><br>
		<a href="logout.jsp">Logout</a>
		
</center>
</body>
</html>