package com.dept.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetData {

	public Details get_values(String dept_id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");

		PreparedStatement ps = null;
		ResultSet rs = null;

		Details details = new Details();

		try {

			String query = "select * from emp.dept where dept_id=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, dept_id);
			rs = ps.executeQuery();

			while (rs.next()) {
				details.setDept_id(rs.getString("dept_id"));
				details.setName(rs.getString("name"));
				details.setDescription(rs.getString("description"));
				details.setCount_emp(rs.getString("count_emp"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return details;

	}

	public void edit_name(Details details) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");

		try {
			PreparedStatement ps = null;
			ResultSet rs = null;

			String query = "UPDATE emp.dept SET name='?',description='?',count_emp=? where dept_id=?;";
			ps = conn.prepareStatement(query);
			ps.setString(1, details.getName());
			ps.setString(2, details.getDescription());
			ps.setString(3, details.getCount_emp());
			ps.setString(4, details.getDept_id());
			rs = ps.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
