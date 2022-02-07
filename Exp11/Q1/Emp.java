package Exp11.Q1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//loading the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//using the getConnection() to connect to the database 
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
		
		//created an object of the Statement class
		Statement st = conn.createStatement();
		
		int result = st.executeUpdate("create table empData(id int,name varchar(20));");  //DDL or DML
		
		System.out.println(result+" rows affected..!");
		
	}
}

