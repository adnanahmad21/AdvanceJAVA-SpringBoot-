package org.example;
import  java.sql.*;
public class SqlConnection {
   static Connection con=null;
   static String url
            = "jdbc:mysql://localhost:3306/truckmanagement"; // table details
  static  String username = "root"; // MySQL credentials
   static String password = "adnan@21";

   public static   Connection getConnection() throws Exception{
       return  DriverManager.getConnection(url,username,password);
   }
}
