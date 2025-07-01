package com.adnan.SpringBootP01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements  Engine{
    PetrolEngine()
    {
        System.out.println("petrol Engine Constructor");
    }
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}
