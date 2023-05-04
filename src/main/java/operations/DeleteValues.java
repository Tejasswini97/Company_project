package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteValues {
	public void deleteValue(String deptid) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");

		PreparedStatement ps = null;
		
		

		try {

			String query = "DELETE FROM emp.dept WHERE deptid=?;";
			ps = conn.prepareStatement(query);
			ps.setString(1, deptid);
			ps.executeUpdate();

			

		} catch (SQLException e) {

			e.printStackTrace();
		}	
		
		

	}

}
