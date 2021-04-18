<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> LOGIN SUCCESSFULL</title>
</head>
<body topmargin=140>
<body background = "background.png">
<center>
<br><br>
<form action="FileUploadHandler" enctype="multipart/form-data" method="post">
	Enter File Name : <input type="text" name="file_name"><br><br>
 	Select : <input type="file" name="file2" /><br><br>
 	<input type="submit" value="Upload" />
</form> 
 <%
 String file_name=(String)request.getParameter("filename");
 if(file_name!=null){
 out.println(file_name+"File uploaded successfuly");
 }
 %>

	<h5 align=right><form action="changepass.jsp"><input type="submit" value="Change Password"></form><br><form action="Log.jsp"><input type="submit" value="Logout"></form><br><a href= "http://www.banasthali.org/banasthali/wcms/en/home/index.html"><input type="submit" value="Go To HomePage"></a></hr><br>
	
	
	<br><br><br><br>
	<marquee><font color="blue"><font size= 4>Accredited with the highest possible grade 'A++' with CGPA 3.63/4.00 by NAAC.</font></font></marquee>
	
</body>
</body>
</html>