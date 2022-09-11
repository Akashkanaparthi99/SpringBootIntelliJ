package com.tutorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TutorEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorEurekaServiceApplication.class, args);
	}

}
