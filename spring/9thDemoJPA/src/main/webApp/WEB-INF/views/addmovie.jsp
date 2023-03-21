<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="actionmovie" method="post">
		Movie Id: <input type="number" name="mid"><br>
		<br> Movie Name: <input type="text" name="mname"><br>
		<br> Language: <select name="language">
			<option value="English">English</option>
			<option value="Hindi">Hindi</option>
			<option value="Other">Other</option>
		</select><br>
		<br> Director: <input type="text" name="director"><br>
		<br> <input type="submit" value="Insert Movie">
	</form>
</body>
</html>