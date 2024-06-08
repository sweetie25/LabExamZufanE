package com.itsc.ioc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class StudentRepo {
	public void createDBAndTable() { 
		String jdbcURL = "jdbc:mysql://localhost:3306/labexamdb";
		String username = "root";
		String pwd = "mom123me!@";
		try (Connection connection = DriverManager.getConnection(jdbcURL, username, pwd);
				Statement statement = connection.createStatement()) {
			String query = "SELECT * FROM labexam1";
			System.out.println("Query executed: " + query);
			            
			String createTableSQL = "CREATE TABLE IF NOT EXISTS exam1 (" +
			                    "id INT AUTO_INCREMENT PRIMARY KEY," +
			                    "first_name VARCHAR(255)," +
			                    "last_name VARCHAR(255)," +
			                    "email VARCHAR(255)," ;
			                 //   "hire_date DATE," +
			                 //   "salary DECIMAL(10, 2))";
			statement.executeUpdate(createTableSQL);
			System.out.println("Table ‘labexam1’ created successfully.");
		}
	}
			public void insertIntoTable(Student student) { String[] insertStatements = {
	                    "insert into labexam1(first_name, last_name, school, email) values('Aster', 'Nega', 'Radical', 'abc@gmail.com')",
	                    "insert into labexam1(first_name, last_name, school, email) values('Jemal', 'Edris', 'Bole', 'bcd1@gmail.com')",
	                    "insert into labexam1(first_name, last_name, school, email) values('Haile', 'Anaol', '4kilo', 'cbc12@gmail.com')",
	                    "insert into labexam1(first_name, last_name, school, email) values('Teddy', 'Anbesaw', 'Minilik', 'dfed21@gmail.com')"
	            };
	            for (String stmt : insertStatements) {
	                Statement statement;
					statement.executeUpdate(stmt);
	            }
	            
	            System.out.println("Data inserted successfully.");
	        } 
			catch (SQLException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	     
	}	
	

