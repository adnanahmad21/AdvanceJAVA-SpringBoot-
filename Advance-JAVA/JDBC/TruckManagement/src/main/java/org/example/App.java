package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//Truck  tata=new Truck("TATA","2020","1000KG","ABDUS SABOOR");
//Truck  volvo=new Truck("VOLVO","2015","800KG","RAMESH");
//Truck  mahindra=new Truck("MAHINDRA","2024","1200KG","ADNAN AHMAD");
TruckService trs=new TruckService();
//trs.addTruck(tata);
//trs.addTruck(volvo);
//trs.addTruck(mahindra);
 Truck truck =trs.getbyId(1);
        System.out.println( " Before update DATA ="+truck); //without updating
        truck.setDriver_name("Iqra Inam"); // updating
        // for updating in db
        trs.updateTruck(truck);
        System.out.println("After update DATA ="+trs.getbyId(1));
        List<Truck> arr=trs.getAllTrucks();
        for(Truck t :arr)
            System.out.println(t);

    }
}
