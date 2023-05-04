package emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
public class GetDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
			String dept_id = request.getParameter("id");
			String name = request.getParameter("deptname");
			String description = request.getParameter("des");
			String count_emp = request.getParameter("count");

			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO emp.dept(dept_id,name,description,count_emp)"
							+ " values" + "(? ,?,?,?)");

			ps.setString(1, dept_id);
			ps.setString(2, name);
			ps.setString(3, description);
			ps.setString(4, count_emp);
			

			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

		PrintWriter writer = response.getWriter();

		writer.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "		<h3>Insert Sucessful" + "</h3>\r\n" + "</body>\r\n" + "</html>");
	}

}