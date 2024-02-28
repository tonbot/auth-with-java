package com.surepay.db;

import java.sql.*;

public class DbConnection {
	private final static String host = "//localhost:3306/";
	private final static String dbname = "auth_with_java";
	private final static String url = "jdbc:mysql:"+host+dbname;
	private final static String username = "root";
	private final static String password = "";
	private static Connection connection =null;
	
	public DbConnection() throws ClassNotFoundException, SQLException {
		 makeConnection();
	}
	
	//make connection to the database
	private static void makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
	}
	
	//return connection string 
	public Connection getDbConnection() {
		return connection;
	}

}//end of class


