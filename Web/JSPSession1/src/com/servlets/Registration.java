package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connutil.ConnectionUtil;

import java.sql.*;

/**
 * Servlet implementation class Registration
 */

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username, password, email;
		username = request.getParameter("username");
		password = request.getParameter("password");
		email = request.getParameter("email");
		RequestDispatcher requestDispatcher;
		String query = "SELECT * FROM Registration where username = '"+username+"'";
		Connection con = null;
		int isInsert = 0;
		Statement stmt = null;
		ResultSet rs = null;
		request.setAttribute("a", "Successfully Registered");
		con = ConnectionUtil.getConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if(rs.next()) {
				out.print("User Name already exist");
			}
			else {
				query = "SELECT * FROM Registration where email = '"+email+"'";
				rs = stmt.executeQuery(query);
				if(rs.next()) {
					out.println("Email Already Exist");
				}
				else {
					query = "INSERT INTO Registration VALUES('" + username + "','" + password + "','" + email + "')";
					stmt = con.createStatement();
					isInsert = stmt.executeUpdate(query);
					if (isInsert != 0) {
						requestDispatcher = request.getRequestDispatcher("index.jsp");
						requestDispatcher.forward(request, response);
					}
				}
			}
		} catch (SQLException e) {
			out.println("Server Problem occurred");
		}
		out.print("<br><a href='index.jsp'>Go to home.........</a>");
	}
}
