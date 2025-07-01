package com.adnan.SpringBootP01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP01Application {

	public static void main(String[] args) {

	ApplicationContext context= SpringApplication.run(SpringBootP01Application.class, args);
     Car myCar=context.getBean(Car.class);
	 myCar.drive();
	}

}
