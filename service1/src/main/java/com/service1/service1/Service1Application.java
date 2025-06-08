package com.service1.service1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Service1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Service 1 Application has started successfully!...");
	}

}
