package com.exilant.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDBConnection {
	// all connection related variables should go here
	static Connection connection;
	public PreparedStatement ps = null, ps1 = null;
	public ResultSet rs = null;

	public static Connection getOracleConn() {
		// here we will have connection object

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@10.2.0.28:1521:orcl", "Orclexi04", "Orclexi04");

			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Connection getMysqlConn() {

		return null;
	}
}
