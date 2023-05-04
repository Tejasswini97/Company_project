package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DataConnection;

public class InsertValues {

	public void insertvalues(String deptid, String deptname, String description, String countemp) {
		DataConnection data = new DataConnection();
		Connection connection = null;
		try {
			connection = data.getConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		PreparedStatement ps = null;

		try {

			String query = ("INSERT INTO emp.dept(deptid,deptname,description,countemp)" + " values" + "(? ,?,?,?)");
			ps = connection.prepareStatement(query);
			ps.setString(1, deptid);
			ps.setString(2, deptname);
			ps.setString(3, description);
			ps.setString(4, countemp);

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
