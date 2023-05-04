package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.DataConnection;
import common.User;

public class CompanyDetails {
	
	public static void main(String[] args) throws Exception {
		CompanyDetails company = new CompanyDetails();
		company.getValues();
			
		}

		public List<User> getValues() throws Exception {
			DataConnection data = new DataConnection();
			Connection connection = data.getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;

			List<User> list = new ArrayList<User>();
			
			
			
			try {
				String query = ("select deptname,description,empname,salary,address,experience from dept,employee where dept.deptid=employee.deptid");
				ps = connection.prepareStatement(query);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					User us = new User();
				
				us.setDeptName(rs.getString("deptname"));
				us.setDescription(rs.getString("description"));
				us.setEmpname(rs.getString("empname"));
				us.setSalary(rs.getString("salary"));
				us.setAddress(rs.getString("address"));
				us.setExperience(rs.getString("experience"));
				list.add(us);
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			finally {
				connection.close();
			}
			return list;
		}

}
