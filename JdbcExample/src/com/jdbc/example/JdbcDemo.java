package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.Loading the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.create the connnection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack", "root", "sandy123");
		
		//3.create the Statement
		Statement stmt=conn.createStatement();
		
		//4.execute the queries
		//ddl->execute(),dml->executeUpdate(),drl/dql->executeQuery()
		//stmt.execute("create table product(pid int,pname varchar(15))");
		stmt.executeUpdate("insert into product values(1,'Laptop')");
		stmt.executeUpdate("insert into product values(2,'Mobile')");
		
		//5.close the connnection
		conn.close();
		System.out.println("Table is created and Data is inserted");
		
	}

}
