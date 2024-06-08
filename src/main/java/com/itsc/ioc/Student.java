package com.itsc.ioc;
import java.sql.*;

public class Student {

	public static void main(String[] args) {
		public class StatementWithResultSet {
			public static void main(String[] args) throws SQLException {
				String jdbcURL = "jdbc:mysql://localhost:3306/labexamdb";
				String username = "root";
				String pwd = "mom123me!@";
				Connection connection = DriverManager.getConnection(jdbcURL,username, pwd);
				Statement statement = connection.createStatement();
				String query = "Select * from labexam1";
				String createTableSQL = "CREATE TABLE labexam1 (" +"id int auto_increment primary key," +"first_name varchar(255)," +"last_name varchar(255)," +"school varchar(255)," + "email varchar(255))";
				statement.executeUpdate(createTableSQL);
				System.out.println("Ttable ‘labexam’ created successfully.");
		 }
		}


	}

}
