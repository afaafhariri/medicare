package com.medicareserver.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
        System.out.println("Let's go! Application is up and running");
	}

}
