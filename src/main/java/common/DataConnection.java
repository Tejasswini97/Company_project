package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {

	public static void main(String[] args) throws Exception {

		DataConnection data = new DataConnection();

		System.out.println(data.getConnection());

	}

	public Connection getConnection() throws SQLException  {

		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return connection;

	}

}
