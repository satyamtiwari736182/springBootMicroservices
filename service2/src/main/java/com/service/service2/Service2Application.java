package com.service.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.netflix.discovery.converters.Auto;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Service2Application implements CommandLineRunner {
	@Autowired
	Service1 service1;

	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Service 2 is running...");

		String response = service1.helloService1();
		System.out.println("Response from Service 1: " + response);

	}

}
