package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeCache;
import com.helper.RegistrationAuthentication;
import com.model.Employee;

public class RegistrationForm extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		boolean flag = true;
		PrintWriter pw = res.getWriter();
		RequestDispatcher requestDispatcher ;
		if(req.getParameter("name").equals("") || req.getParameter("email").equals("") || req.getParameter("id").equals("") || req.getParameter("age").equals("")) {
			flag = false;
			req.setAttribute("msg", "Specify all Details");
		}
		if(flag) {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			int id =(Integer.parseInt(req.getParameter("id")));
			int age =(Integer.parseInt(req.getParameter("age")));
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date = new Date();
			if(RegistrationAuthentication.check(id)) {
				Employee employee = new Employee(name, email, id, age, dateFormat.format(date));
				EmployeeCache employeeCache = EmployeeCache.getInstance();
				employeeCache.addEmployee(employee);
				req.setAttribute("cache", employeeCache);
				requestDispatcher = req.getRequestDispatcher("ListController");
				requestDispatcher.forward(req, res);
			}
			else {
				req.setAttribute("msg","Id Already Present");
			}
		}
		requestDispatcher = req.getRequestDispatcher("registration.jsp");
		requestDispatcher.forward(req, res);
		
	}
	
	
}	
