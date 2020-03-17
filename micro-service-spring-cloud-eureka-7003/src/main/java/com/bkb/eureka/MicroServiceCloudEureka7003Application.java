package com.bkb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceCloudEureka7003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCloudEureka7003Application.class, args);
	}

}
