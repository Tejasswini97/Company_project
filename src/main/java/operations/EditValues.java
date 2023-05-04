package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import common.DataConnection;
import common.User;

public class EditValues {

	public User editValue(String deptid) throws Exception {
		DataConnection data = new DataConnection();
		Connection connection = data.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		User us = new User();

		try {
			String query = ("select * from emp.dept where deptid=?");
			ps = connection.prepareStatement(query);
			ps.setString(1, deptid);
			rs = ps.executeQuery();

			while (rs.next()) {

				us.setDeptid(rs.getString("deptid"));
				us.setDeptName(rs.getString("deptname"));
				us.setDescription(rs.getString("description"));
				us.setCountemp(rs.getString("countemp"));

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return us;
	}

	public void updateValue(User us) {
		DataConnection data = new DataConnection();
		Connection connection = null;
		
		try {
			 connection = data.getConnection();
			 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		PreparedStatement ps = null;

		try {
			String query = ("UPDATE emp.dept SET deptname=?, description=?,countemp=? where deptid=?");
			ps = connection.prepareStatement(query);
			ps.setString(1, us.getDeptName());
			ps.setString(2, us.getDescription());
			ps.setString(3, us.getCountemp());
			ps.setString(4, us.getDeptid());
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
