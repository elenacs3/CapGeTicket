package com.capgeticket.resteventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestEventosApplication.class, args);
	}

}
