package jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "root");
			String id = request.getParameter("empid");
			String firstname = request.getParameter("fname");
			String lastname = request.getParameter("lname");
			String address = request.getParameter("addr");
			String contact = request.getParameter("cont");
			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO details.employee(id,first_name,last_name,address,contact)"
							+ " values" + "(? ,?,?,?,?)");

			ps.setString(1, id);
			ps.setString(2, firstname);
			ps.setString(3, lastname);
			ps.setString(4, address);
			ps.setString(5, contact);

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		}
	
		 /*finally 
		 { if (ps != null) { 
			 RequestDispatcher rd =request.getRequestDispatcher("Welcome.jsp");
		 }
		   
		 try { 
			 ps.close(); 
		 }
		  catch(SQLException e) { e.printStackTrace(); }*/
		 

		PrintWriter writer = response.getWriter();

		writer.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "		<h3>Registarion Sucessful" + "</h3>\r\n" + "</body>\r\n" + "</html>");
	}

}
