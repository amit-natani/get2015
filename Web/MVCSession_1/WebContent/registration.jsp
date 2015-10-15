<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  

    <title>Metacube</title>

    
    <link href="css/style.css" rel="stylesheet">

   
   
 
  </head>

  <body>
 <%
 
 %>
 
    <nav>
		<h3 style="color: white">METACUBE</h3>
		<ul>
			<li><a href = "HomeServlet">HOME</a></li>
			<li><a href ="RegistrationFormServlet">REGISTRATION</a></li>
			<li><a href = "ListController">EMPLOYEE LIST</a></li>
		</ul>
	</nav>


	<section>
	
	<div class="container" >
		<form action="RegistrationForm" >
		
		<table>
		<tr>
			<td>NAME</td>
			<td><input type="text" name="name" id="name"></td>
			<td><label>${nameReq}</label></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name="email" id="email"></td>
			<td><label>${emailReq}</label></td>
		</tr>
		<tr>
			<td>Id</td>
			<td><input type="number" name="id" id="id"></td>
			<td><label>${idReq}</label></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="number" name="age" id="age" min = "20"></td>
			<td><label>${ageReq}</label></td>
		</tr>
		<tr>
			<td colspan = "2" align = "center"><input type = "submit" value = "Register"/></td>
		</tr>
		</table>
		</form>
		<label>${msg}</label>
	</div>
	</section>

   
</html>
