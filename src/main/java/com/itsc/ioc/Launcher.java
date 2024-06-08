package com.itsc.ioc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Launcher {
	public static void main(String[] args) throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost:3306/labexamdb";
		String username = "root";
		String pwd = "mom123me!@";
		Connection connection = DriverManager.getConnection(jdbcURL,username, pwd);
		Statement statement = connection.createStatement();
		String query = "Select * from labexam1";
		ResultSet res = statement.executeQuery(query);
		while(res.next()) {
			int id = res.getInt("id");
			String fname = res.getString("first_name");
		    String lname = res.getString("last_name");
	        String school = res.getString("school");
			email Email = res.getDate("email");
			System.out.println("Student ID: " + id);
		    System.out.println("Student Name: " + fname);
		    System.out.println("Student Email: " + Email);
		    System.out.println("...............");
		 }
		 res.close(); statement.close(); connection.close();
		 }


	}


