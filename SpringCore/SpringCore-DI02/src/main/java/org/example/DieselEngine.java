package org.example;

public class DieselEngine implements  IEngine{
    DieselEngine()
    {
        System.out.println("Diesel Engine Constructor");
    }
   public int start()
    {
        System.out.println("Diesel Engine Started");
        return 1;
    }


}
