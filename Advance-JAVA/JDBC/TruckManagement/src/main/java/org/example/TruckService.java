package org.example;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class TruckService {

     void addTruck(Truck truck)
    {
 String query="insert into  truckdata (name,model,capacity,driver_name)  values (?,?,?,?)";
 try{
     Connection con=SqlConnection.getConnection();
     PreparedStatement ps=con.prepareStatement(query);
     ps.setString(1,truck.getName());
     ps.setString(2, truck.getModel());
     ps.setString(3, truck.getCapacity());
     ps.setString(4, truck.getDriver_name());
     System.out.println(ps.executeUpdate());
 } catch (Exception e) {
     e.printStackTrace();
 }
    }


    Truck getbyId(int id){
        Truck truck =new Truck();
        String query="select * from truckdata   where id= ? ";
        try {
            Connection con=SqlConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                truck.setId(rs.getInt("id"));
                truck.setName(rs.getString("name"));
                truck.setModel(rs.getString("model"));
                truck.setCapacity(rs.getString("capacity"));
                truck.setDriver_name(rs.getString("driver_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  truck;


    }
      void updateTruck(Truck truck){
        String query="update  truckdata set  name=?, model= ?, capacity = ? ,driver_name = ? where id= ? ";
        try{
            Connection con=SqlConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,truck.getName());
            ps.setString(2, truck.getModel());
            ps.setString(3,truck.getCapacity());
            ps.setString(4,truck.getDriver_name());
            ps.setInt(5,truck.getId());
  int x=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      List<Truck> getAllTrucks(){
        String query="select * from truckdata";
        List<Truck> list=new ArrayList<>();
        try{
            Connection con=SqlConnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(query);
            while (rs.next()){
                Truck truck=new Truck();
                truck.setId(rs.getInt("id"));
                truck.setName(rs.getString("name"));
                truck.setModel(rs.getString("model"));
                truck.setCapacity(rs.getString("capacity"));
                truck.setDriver_name(rs.getString("driver_name"));
                list.add(truck);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  list;

    }



}

