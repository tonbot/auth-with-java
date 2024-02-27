package surepay;

import java.sql.*;

public class DbConnection {


public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String host = "//localhost:3306/";
		String dbname = "auth_with_java";
		String url = "jdbc:mysql:"+host+dbname;
		String username = "root";
		String password = "";
		Connection connection = DriverManager.getConnection(url, username, password);

	}//end of main

}//end of class
