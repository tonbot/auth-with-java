package com.surepay.db;

import java.sql.Connection;
import java.sql.SQLException;

public class TextClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbConnection myConnection = new DbConnection();
		Connection connection = myConnection.getDbConnection();
		System.out.println(connection);
	}

}
