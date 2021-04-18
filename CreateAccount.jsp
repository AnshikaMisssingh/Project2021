<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
	body{
		text-align:center;
		position: top;
		}
</style>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body topmargin="142">
<body background="background.png">
<h2> ENTER DETAILS </h2>
<form action="Create" method="post">
	
	Email Id: <input type="email" name="id" required="required">
	<br><br>
	
	Password: <input type="password" name="password" required="required">
	<br><br> 
	
	Permissions: <input type="text" name="permissions" required="required">
	<br><br>
	
	UserID: <input type="text" name="userid" required="required">
	<br><br>
	
	Role: <input type="text" name="role" required="required">
	<br><br>
	
		
	<input type="submit" value="Create Account">
	<input type="reset" value="RESET">
</form>
</body>
</body>
</html>