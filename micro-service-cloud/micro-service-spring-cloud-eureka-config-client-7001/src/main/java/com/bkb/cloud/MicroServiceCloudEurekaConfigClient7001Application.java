package com.bkb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceCloudEurekaConfigClient7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudEurekaConfigClient7001Application.class, args);
    }

}
