package com.instagram.Instagram;

import com.instagram.Instagram.beans.Instagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InstagramApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(InstagramApplication.class, args);
	Instagram ig= context.getBean(Instagram.class);
	ig.play();

	}

}
