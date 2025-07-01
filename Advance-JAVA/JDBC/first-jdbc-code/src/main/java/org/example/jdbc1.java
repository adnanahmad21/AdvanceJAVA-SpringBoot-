package org.example;
import java.sql.*;
import java.util.Stack;
import  java.lang.*;
public class jdbc1 {

    public static void main(String[] args) {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","adnan@21");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from datadb");
            int id;
            String name;
            String year;
            String branch;
            while(rs.next()){
                id=rs.getInt("id");
                name= rs.getString("name");
                year= rs.getString("year");
                branch= rs.getString("branch");
                System.out.println("Id = "+id+ " Name = "+name+" Year = " +year+" Branch = " +branch );
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
// public static String LOAD_DRIVER=="com.mysql.cj.jdbc.Driver";
//public static String URL="jdbc:mysql://localhost:3306/userdb";
// public static  String USERNAME="root";
// public static String PASSWORD="adnan@21";
