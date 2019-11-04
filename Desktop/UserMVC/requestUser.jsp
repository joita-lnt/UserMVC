<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="GET" action="http://localhost:9090/UserMVC/FetchUserController">
<center>
Enter Id: <input type="text" name="id">
<br><br>
<input type="submit" value="Load User">
</center>
</form>

</body>
</html>