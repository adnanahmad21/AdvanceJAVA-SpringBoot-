package org.example;
public class Car {
    Car()
    {
        System.out.println("Car constructor");
    }
    // constructor method
    Car(IEngine engine)
    {
        System.out.println("Car constructor");
        this.engine=engine;
    }
    IEngine engine;
//setter method
    public void setEngine(IEngine engine)
    {
        System.out.println("setter method called");
        this.engine=engine;
    }
    public void drive ()
    {
        if (engine.start() == 1) System.out.println("Car Started");
        else System.out.println("Car not started");
    }

}
