
package com.register.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpRegistration extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "root");

			String id = req.getParameter("empid");
			String firstname = req.getParameter("fname");
			String lastname = req.getParameter("lname");
			String address = req.getParameter("addr");
			String contact = req.getParameter("cont");
			PreparedStatement part = conn
					.prepareStatement("INSERT INTO details.employee(id,first_name,last_name,address,contact)"
							+ " values" + "(?,?,?,?,?)");

			part.setString(1, id);
			part.setString(2, firstname);
			part.setString(3, lastname);
			part.setString(4, address);
			part.setString(5, contact);
			part.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} /*finally {
			if (part != null) {
				RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
				try {
					part.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}*/
		

		PrintWriter writer = resp.getWriter();

		writer.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "		<h3>Registarion Sucessful" + "</h3>\r\n" + "</body>\r\n" + "</html>");

	}

}
