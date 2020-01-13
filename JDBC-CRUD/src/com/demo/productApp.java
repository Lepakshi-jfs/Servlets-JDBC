package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class productApp {
	public static void main(String[] args) {
		//dropTable();
		//createTable();
		//createProduct();
		//createProduct(104, "Wings of Fire");
		//updateProduct();
		//updateProduct(104, "THE PLACEBO EFFECT");
		//deleteProduct(104);
		//selectProduct();
	}
	public static void createTable() {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			String createTableQuery = "CREATE TABLE PRODUCTS (PRODUCT_ID NUMBER, PRODUCT_NAME VARCHAR(255))";
			System.out.println(createTableQuery);
			statement.execute(createTableQuery);
			System.out.println("Successfully created table ");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public static void createProduct() {
		// Get ojdbc14.jar
				// Load the driver
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//System.out.println("Driver loaded successfully!");
					//Get the connection
					Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
					//System.out.println("Connection Established!");
					//Create the statement
					Statement statement = connection.createStatement();
					//Execute the query
					//Hard coded values
					String insertQuery = "insert into products values (102,'CANT HURT ME')";
					int noOfRowsAffected = statement.executeUpdate(insertQuery);
					System.out.println("Successfully inserted " + noOfRowsAffected + "record(s)!");
				} catch (ClassNotFoundException e) {
					System.out.println(e);
				} catch (SQLException e) {
					System.out.println(e);
				}
	}
	public static void createProduct(int productId, String productName) {
		// Get ojdbc14.jar
				// Load the driver
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//System.out.println("Driver loaded successfully!");
					//Get the connection
					Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
					//System.out.println("Connection Established!");
					//Create the statement
					Statement statement = connection.createStatement();
					//Execute the query
					String insertQuery = "insert into products values (" + productId + ",'" + productName + "')";
					System.out.println(insertQuery);
					int noOfRowsAffected = statement.executeUpdate(insertQuery);
					System.out.println("Successfully inserted " + noOfRowsAffected + "record(s)!");
				} catch (ClassNotFoundException e) {
					System.out.println(e);
				} catch (SQLException e) {
					System.out.println(e);
				}
	}
	
	public static void selectProduct() {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			ResultSet resultSet = statement.executeQuery("select * from products");
			while(resultSet.next()) {
				int productId = resultSet.getInt("product_id");
				String productName = resultSet.getString("product_name"); 
				System.out.println("Product Id " + " > " + productId +  " Product Name  " + " > " + productName);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void updateProduct() {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			String updateQuery = "UPDATE  products SET PRODUCT_NAME = 'THE POWER OF POSITIVE THINKING' ";
			System.out.println(updateQuery);
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("Successfully inserted " + noOfRowsAffected + "record(s)!");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void updateProduct(int productId, String productName) {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			String updateQuery = "UPDATE  products SET PRODUCT_NAME = '" + productName + "' where product_id = " + productId;
			System.out.println(updateQuery);
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("Successfully inserted " + noOfRowsAffected + "record(s)!");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public static void deleteAllProducts() {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			String updateQuery = "delete from products";
			System.out.println(updateQuery);
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("Successfully deleted " + noOfRowsAffected + "record(s)!");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public static void deleteProduct(int productId) {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			String updateQuery = "delete from products where product_id =" + productId;
			System.out.println(updateQuery);
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("Successfully deleted " + noOfRowsAffected + "record(s)!");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void dropTable() {
		// Get ojdbc14.jar
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			String dropTableQuery = "DROP TABLE PRODUCTS";
			System.out.println(dropTableQuery);
			statement.execute(dropTableQuery);
			System.out.println("Successfully DROPPED table ");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
