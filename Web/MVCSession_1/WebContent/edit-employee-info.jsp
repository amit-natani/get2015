<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
      <title>Metacube</title>
    <link href="css/style.css" rel="stylesheet">
  <style type="text/css">
  	
  
  </style>
  </head>

  <body >

    <nav>
		<h3 style="color: white">METACUBE</h3>
		<ul>
			<li><a href = "HomeServlet">HOME</a></li>
			<li><a href ="RegistrationFormServlet">REGISTRATION</a></li>
			<li><a href = "ListController">EMPLOYEE LIST</a></li>
		</ul>
	</nav>

	<section>		
			<%			
				Employee employee =(Employee)request.getAttribute("employee");
				out.println(request.getRequestURL());
				out.println("<div class=\"container\">");
			 	out.println("<form><table border = \"2\"><tr>");
				out.println("<td>Employee ID</td><td>Employee Name</td><td>Employee EmailID</td><td>Employee Age</td><td>"+"Registration Date</td></tr>");
				out.println("<tr><td><label>"+employee.getId()+"</label><input hidden name ='id' type = 'text' value = '" + employee.getId() + "'></td>");
			 	out.println("<td><input name = 'name' type = 'text' value = '" + employee.getName() + "'></td>");
			 	out.println("<td><input name = 'email' type = 'text' value = '" + employee.getEmail() + "'></td>");
			 	out.println("<td><input name = 'age' type = 'text' value = '" + employee.getAge() + "'></td>");
			 	out.println("<td><label>"+employee.getDateOfRegistration()+"</label><input hidden name ='date' type = 'text' value = '" + employee.getDateOfRegistration() + "'></td>");
			 	out.println("<tr><td colspan = '5' align = 'center'><input type = 'submit' value = 'Update' formaction = 'UpdateEmployee'/></td></tr></table>"); 	
			 	out.println("</form>");
			 %>
	</section>
</html>
