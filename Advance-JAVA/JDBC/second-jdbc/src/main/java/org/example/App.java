package org.example;

/**
 * Hello world!
 *
 */
import java.sql.*;
import java.util.Stack;
import  java.lang.*;
public class App {

    public static void main(String[] args) {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","adnan@21");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from datadb");
            int id;
            String name;
            while(rs.next()){
                id=rs.getInt("id");
                name= rs.getString("name");
                System.out.println("Id = "+id+ "Name = "+name );
            }
            rs.close();
            con.close();
        } catch (Exception e) {
         e.printStackTrace();
        }

    }
}
