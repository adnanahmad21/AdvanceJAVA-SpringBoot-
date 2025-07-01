package com.adnan.SpringBootP01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// agr na lgate consue hota spring container kyuki  @Component kewal ek
//implementation class ko find krega but 2 milege so primary lga k ye error htate
// also we can use  Qualifer
@Component
@Primary
public class DieselEngine implements  Engine{
    DieselEngine()
    {
        System.out.println("Diesel Engine Constructor");
    }
   @Override
    public void start()
    {
        System.out.println("diesel engine started");
    }

}
