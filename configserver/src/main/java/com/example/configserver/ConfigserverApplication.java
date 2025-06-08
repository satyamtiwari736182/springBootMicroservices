package com.example.configserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigserverApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Config Server is running...");
	}

}
