package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import common.DataConnection;
import common.User;

public class ViewValues {
	public static void main(String[] args)   {
		ViewValues values = new ViewValues();
		values.getValues();

	}

	public List<User> getValues()  {
		DataConnection data = new DataConnection();
		Connection connection = null;
		try {
			connection = data.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

		List<User> list = new ArrayList<User>();

		try {
			String query = ("select * from dept");
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User us = new User();

				us.setDeptid(rs.getString("deptid"));
				us.setDeptName(rs.getString("deptname"));
				us.setDescription(rs.getString("description"));
				us.setCountemp(rs.getString("countemp"));
				list.add(us);
			}

		} catch (Exception e) {
			System.out.println(e);
		
		}
		
		return list;
	}
}
