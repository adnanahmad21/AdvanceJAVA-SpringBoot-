package org.example;

import java.io.PipedWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//     IEngine engine=new PetrolEngine();
//     Car car=new Car();
  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
  Car car=context.getBean(Car.class);
 car.drive();

    }
}
