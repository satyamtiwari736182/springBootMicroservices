package com.serviceregistry.serviceregistry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceregistryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistryApplication.class, args);
	}

	@Override
	public void run(String... args) {

		System.out.println("Service Registry Application has started successfully!...");
	}

}
