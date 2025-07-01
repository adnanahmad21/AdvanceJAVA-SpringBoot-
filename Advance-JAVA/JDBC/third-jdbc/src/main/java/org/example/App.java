package org.example;


import  java.util.*;
import  java.sql.*;
public class App
{
    public static void main( String[] args ) throws  Exception {
        String url=  "jdbc:mysql://localhost:3306/spark";
        String id="root";
        String pass="adnan@21";
        Connection con=null;
      try{

          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection(url,id,pass);
          String query="delete from datadb where id= ? ";
          String q2="insert into datadb(id,name,year,branch) values (? ,? ,?,?)";
          PreparedStatement ps=con.prepareStatement(q2);

          ps.setInt(1,51220140);
          ps.setString(2,"JAI");
          ps.setString(3,"3rd");
          ps.setString(4,"ECE");


          int rowaffect=ps.executeUpdate();
          System.out.println(rowaffect);
          //con.close();

      }
      catch (Exception e){
        e.printStackTrace();
      }

    }
}
