package Exp11.Q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        // loading the Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // using the getConnection() to connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin");

        // created an object of the Statement class
        Statement st = conn.createStatement();

        int result = st.executeUpdate("insert into employee values(2,'Prakhar Jadaun');");

        System.out.println(result + " rows affected...!");

        ResultSet rs = st.executeQuery("select * from employee;");
        
        while(rs.next()) 
        {
            System.out.println(rs.getInt(1) + " : " + rs.getString(2));
        }
    }
}
