package com.euroka.carsystemserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CarSystemServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSystemServerApplication.class, args);
	}

}
