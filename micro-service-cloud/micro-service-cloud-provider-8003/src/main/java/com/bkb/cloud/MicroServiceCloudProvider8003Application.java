package com.bkb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceCloudProvider8003Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProvider8003Application.class, args);
    }

}
