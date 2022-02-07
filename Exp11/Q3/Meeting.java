package Exp11.Q3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Meeting {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // loading the Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // using the getConnection() to connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin");

        // created an object of the Statement class
        Statement st = conn.createStatement();

        // creating a table having columns NameOfParticipant, MeetingID, ScheduledTime,
        // Email, Mobile
        st.executeUpdate(
                "create table Meeting(NameOfParticipant varchar(20),MeetingID int,ScheduledTime varchar(20),Email varchar(30),Mobile varchar(10));");

        // populating the table with random

        st.executeUpdate("insert into Meeting values('Prakhar',1144,'Tuesday','prakhar@gmail.com','1234567891')");
        st.executeUpdate("insert into Meeting values('Ram',1144,'Monday','ram@gmail.com','1111123456')");
        st.executeUpdate("insert into Meeting values(\"Shyam\",1144,\"Tuesday\",\"Shyam@gmail.com\",\"9999999999\")");
        st.executeUpdate(
                "insert into Meeting values(\"Ashish\",1105,\"Wednesday\",\"Ashish@gmail.com\",\"2345678901\")");
        st.executeUpdate("insert into Meeting values(\"Rohit\",1105,\"Tuesday\",\"Rohit@gmail.com\",\"1111111111\")");

        System.out.println("---Part A----");
        ResultSet rs = st.executeQuery("select * from Meeting"); // DQL

        ResultSetMetaData rmd = rs.getMetaData();

        System.out.println("Number of columns : " + rmd.getColumnCount());
        System.out.println("Column names in the table Meeting : ");
        for (int i = 1; i <= rmd.getColumnCount(); i++) {
            System.out.println(rmd.getColumnName(i));
        }

        System.out.println("\n----Part B----");
        System.out.println("Names of participants in meeting 1144 : ");
        while (rs.next()) {
            if (rs.getInt(2) == 1144) {
                System.out.println(rs.getString(1));
            }
        }

        System.out.println("\n----Part C-----");
        st.executeUpdate("Insert into Meeting(NameOfParticipant,ScheduledTime) values('Suraj','Monday');");

        rs = st.executeQuery("select * from Meeting");
        String s = "Suraj";
        System.out.print("ID assigned to the new participant : ");
        while (rs.next()) {
            if (s.compareTo(rs.getString(1)) == 0) {
                System.out.println(rs.getInt(2)); // null =>0
            }
        }

        System.out.println("\n----Part D----");
        rs = st.executeQuery("select * from Meeting");
        int counter = 0;
        while (rs.next()) {
            if (rs.getInt(2) == 1105) {
                counter++;
            }
        }
        System.out.println("Meeting ID - 1105\nNumber of people : " + counter);

        System.out.println("\n-----Part E----");
        System.out.println("Participants attending Tuesday meetings : ");
        rs = st.executeQuery("select * from Meeting");
        s = "Tuesday";
        while (rs.next()) {
            if (s.compareTo(rs.getString(3)) == 0) {
                System.out.println(rs.getString(1));
            }
        }
    }
}
