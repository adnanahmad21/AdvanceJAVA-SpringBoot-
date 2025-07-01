package com.adnan.SpringBootP01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired   // field based dependency
    private Engine engine;

//   @Autowired //---> Constructor based dependency
//    Car(Engine engine)
//    {
//        this.engine=engine;
//        System.out.println("car constructor");
//    }


//    @Autowired//--->setter based DI
//    private void setEngine(Engine engine)
//    {
//        System.out.println("Setter based");
//        this.engine=engine;
//    }
    void drive()
    {
        engine.start();
        System.out.println("Car Started");
    }


}
