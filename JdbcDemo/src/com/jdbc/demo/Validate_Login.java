package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//create table login(username varchar(15),password varchar(15));
//insert into login values('stella','stella123');

public class Validate_Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username:");
		String uname = scan.next();
		System.out.println("Enter Password:");
		String pass = scan.next();
//				1)Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//				2)Create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack", "root", "sandy123");
//				3)Statement-->createStatement,preparedStatement-->prepareStatement
		PreparedStatement psmt = conn.prepareStatement("select * from login where username=? and password=?");
		psmt.setString(1, uname);
		psmt.setString(2, pass);
//				4)execute query
		ResultSet result = psmt.executeQuery();
		// 5)close the connection
		if (result.next()) {
			System.out.println("LOGIN SUCCESS");
		} else {
			System.out.println("Enter Valid Credentials");
		}
		conn.close();
		scan.close();
	}

}


