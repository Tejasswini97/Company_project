

package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import common.DataConnection;
import common.User;

public class EmployeeDetails {

	public static void main(String[] args)  {
		EmployeeDetails emp = new EmployeeDetails();
		emp.getValues();

	}

	public List<User> getValues() {
		DataConnection data = new DataConnection();
		Connection connection = null;
		try {
			connection = data.getConnection();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<User> list = new ArrayList<User>();

		try {
			String query = ("select * from employee");
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				User us = new User();

				us.setDeptid(rs.getString("deptid"));
				us.setEmpname(rs.getString("empname"));
				us.setSalary(rs.getString("salary"));
				us.setAddress(rs.getString("address"));
				us.setExperience(rs.getString("experience"));
				list.add(us);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
