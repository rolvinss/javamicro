package com.poc.microservices.energyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EnergyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergyServiceApplication.class, args);
	}

}
