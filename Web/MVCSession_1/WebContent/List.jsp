<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>


<title>Metacube</title>


<link rel = "stylesheet" href = "css/style.css"/>

</head>

<body style="margin: 0">

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
	Map<Integer, Employee> employeeMap = (Map<Integer, Employee>)request.getAttribute("list");
	
	out.println("<div class= 'container'>");	
	out.println("<table border = '3'>");
	out.println("<tr><td>Employee ID</td> <td>Employee Name</td><td>Employee Email ID</td><td>View Details</td><td>Edit Details</td></tr>");
	for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
				Employee employee = entry.getValue();
			
			 out.println("<tr><td>" +employee.getId() + "</td>" );
			 out.println("<td>"+ employee.getName() + "</td>" );
			 out.println("<td>" + employee.getEmail() + "</td>"  );
			 out.println("<td><a href='EmployeeDetail?id="+employee.getId()+"'>VIEW</a></td>");
			 out.println("<td><a href='EditEmployeeController?id="+employee.getId()+"'>EDIT</a></td></tr>");
			
		
	}
	out.println("</table></div>");
		%>
	</section>
	</body>
</html>
