package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TraditionalJDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/TEST_DB";
		String username = "sa";
		String password = "qwerty123456789";

		System.out.println("Connecting database...");

		try {
			Connection connection = DriverManager.getConnection(url, username, password); 
			System.out.println("Database connected!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
