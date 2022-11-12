package com.ifms.nameserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NameServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameServeApplication.class, args);
	}

}
