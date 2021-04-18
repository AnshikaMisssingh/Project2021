<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
	table, tr, td{
		border: solid 1px #DDD;
		padding: 2px 3px;	
	}
</style>


<body background="background.png">



<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement st= conn.createStatement();
		ResultSet rs= st.executeQuery("select sta.*, stp.*, sts.sup_id from student_academic sta inner join login l on sta.student_id=l.user_id inner join student_personal stp on sta.student_id=stp.student_id inner join student_supervisor sts on stp.student_id=sts.student_id");
		while(rs.next())
		{
%>

<body topmargin="150" leftmargin="500">
<table cellpadding="3">
<tr><td>Student Id : <%= rs.getString(1) %><br></td></tr>
<tr><td>Name : <%= rs.getString(2) %><br></td></tr>
<tr><td>Research Topic  : <%= rs.getString(3) %><br></td></tr>
<tr><td>Department ID : <%= rs.getString(4) %><br></td></tr>
<tr><td>Eligibility : <%= rs.getString(5) %><br></td></tr>
<tr><td>Master Degree College : <%= rs.getString(6) %><br></td></tr>
<tr><td>CGPA  : <%= rs.getString(7) %><br></td></tr>
<tr><td>Passing Year of Master : <%= rs.getString(8) %><br></td></tr>
<tr><td>Application Submission : <%= rs.getString(9) %><br></td></tr>
<tr><td>Current Job Status : <%= rs.getString(10) %><br></td></tr>
<tr><td>Banasthalite  : <%= rs.getString(11) %><br></td></tr>
<tr><td>Synopsis Submission : <%= rs.getString(12) %><br></td></tr>
<tr><td>Revision : <%= rs.getString(13) %><br></td></tr>
<tr><td>Extension : <%= rs.getString(14) %><br></td></tr>
<tr><td>Re-Registration  : <%= rs.getString(15) %><br></td></tr>
<tr><td>Thesis Submission : <%= rs.getString(16) %><br></td></tr>
<tr><td>Viva Date : <%= rs.getString(17) %><br></td></tr>
<tr><td>Status : <%= rs.getString(18) %><br></td></tr>
<tr><td>Research Topic  : <%= rs.getString(19) %><br></td></tr>
<h5>PERSONAL DETAILS</h5><br>
<tr><td>Age : <%= rs.getString(20) %><br></td></tr>
<tr><td>DOB : <%= rs.getString(21) %><br></td></tr>
<tr><td>Religion : <%= rs.getString(22) %><br></td></tr>
<tr><td>Category  : <%= rs.getString(23) %><br></td></tr>
<tr><td>Father Name : <%= rs.getString(24) %><br></td></tr>
<tr><td>Mother Name : <%= rs.getString(25) %><br></td></tr>
<tr><td>Spouse Name : <%= rs.getString(26) %><br></td></tr>
<tr><td>Corresponding Address  : <%= rs.getString(27) %><br></td></tr>
<tr><td>Permanent Address : <%= rs.getString(28) %><br></td></tr>
<tr><td>Email : <%= rs.getString(29) %><br></td></tr>
<tr><td>Alternate Email : <%= rs.getString(30) %><br></td></tr>
<tr><td>Mobile Number  : <%= rs.getString(31) %><br></td></tr>
<tr><td>Gurdian Mobile Number : <%= rs.getString(32) %><br></td></tr>
<tr><td>Hostel Name : <%= rs.getString(33) %><br></td></tr>
<tr><td>Account Id Number : <%= rs.getString(34) %><br></td></tr>
<tr><td>Supervisor : <%= rs.getString(35) %><br></td></tr>
</table>
</body>
<%
		}
	}
catch(Exception e)
{
	e.printStackTrace();
}
%>
</body>
</body>
</html>