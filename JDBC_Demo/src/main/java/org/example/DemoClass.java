package org.example;
import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/student" ;
        String uname = "root";
        String pass ="******";  //entered pass for mysql
        String query = "select Name from student where id =3;";  //fetch the Name with the id of 3

        Class.forName("com.mysql.cj.jdbc.Driver");  //load the Driver
        Connection con = DriverManager.getConnection(url, uname, pass);  //we need a method that gives us the instance of Connection
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);  //we need ResultSet to store a table structure

        rs.next();   //move the pointer to the next record
        String name = rs.getString("Name"); //we want the column named Name from the table
        System.out.println(name);


    }
}