<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body{position: top;}
</style>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body topmargin="142">
<body background="background3.png">
<h2> LOGIN </h2>
<form action="Log" method="post">
	Email ID:&emsp;<input type="email" name="id" required="required"><br><br>
	College ID:&nbsp;<input type="text" name="userid" required="required"><br><br>
	Password:&ensp;&nbsp;<input type="password" name="password" required="required"><br><br> 
	<input type="submit" value="LOGIN">&emsp;
	<input type="reset" value="RESET">
</form>
<form action="prelog.jsp"><input type="submit" value="BACK"></form><br>
<marquee><font color="blue"><font size= 5>Accredited with the highest possible grade 'A++' with CGPA 3.63/4.00 by NAAC.</font></font></marquee>
<style>

	#divMenu, ul, li, li li {  
    	margin: 0;  
    	padding: 10px;  
	}  
   
	#divMenu {  
		width: 250px;  
    	height: 207px;  
	}
   
	#divMenu ul  
	{  	 
    	line-height: 25px; 
    	top: 200px; 
	}  
   
    #divMenu li {  
        list-style: none;  
        position: relative;   
    }  
   
        #divMenu li li {  
            list-style: none;  
            position: relative;    
            left: 230px;  
            top: -27px;  
        }  
   
   
    #divMenu ul li a {  
        width: 248px;  
        height: inherit;  
        display: block;  
        text-decoration: none;  
        text-align: center;  
        font-family: Georgia,'Times New Roman',serif;  
        color:black;    
    }  
   
    #divMenu ul ul {  
        position: absolute;  
        visibility: hidden;  
        top: auto;  
    }  
   
    #divMenu ul li:hover ul {  
        visibility: visible;  
    }  
   
    #divMenu li:hover {  
        background-color: none;  
    }  
   
    #divMenu ul li:hover ul li a:hover {  
        background-color: none;  
    }  
    
    #divMenu a:hover {  
        font-weight: bold;  
    } 

</style>

<div id="divMenu"> 
	
<ul>    
    <li><a href="#">ABOUT US</a>    
    	<ul>    
        	<li><a href="#">HISTORY</a></li>    
        	<li><a href="#">VISION & MISSION</a></li>    
    	</ul>    
    </li>
        
    <li><a href="#">LIBRARY</a>    
    </li>    
    
    <li><a href="#">EXAMINATION</a></li> 
    
    <li><a href="#">DEPARTMENTS</a>    	
    </li>    
       
    <li><a href="#">FACULTIES</a>    
    </li>
        
    <li><a href="#">HOW TO REACH BANASTHALI</a></li>    
    
    <li><a href="#">CONTACT US</a></li>
    
    <li><a href="#">ONLINE PAYMENT</a></li>
</ul>    
</div>  
</body>
</body>
</html>