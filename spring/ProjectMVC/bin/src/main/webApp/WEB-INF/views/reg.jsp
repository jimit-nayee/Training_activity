<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>GET METHOD</h1>
<form action="checkuser">
User Name : <input type= "text" name="uname"><br><br>
<input type="submit" value="send"><br><br>
</form>

<h1>POST METHOD</h1>
<form action="finduser" method="post">
User Name : <input type= "text" name="uname"><br><br>
<input type="submit" value="send"><br><br>
</form>
</body>
</html>