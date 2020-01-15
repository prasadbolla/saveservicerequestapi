package com.webinterface.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.webinterface.service")
public class SaveServiceRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveServiceRequestApplication.class, args);
	}

}
