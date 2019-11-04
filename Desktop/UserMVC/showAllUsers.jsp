<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.lti.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList<User> list=(ArrayList)session.getAttribute("userList");

if(list.isEmpty())
{
	
%>
No records found
<% 
}
else
{
%>
<table border="1px">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Password</th>
	</tr>
	
<%
	for(User u:list)
	{
%>
<tr>
		<td><a href="http://localhost:9090/UserMVC/FetchUserController?id=<%= u.getId()%>"><%= u.getId() %></a></td>
		<td><%= u.getName() %></td>
		<td><%= u.getEmail() %></td>
		<td><%= u.getPassword() %></td>
</tr>

<% 
	}
%>
	
</table>
<%
}
%>

</body>
</html>