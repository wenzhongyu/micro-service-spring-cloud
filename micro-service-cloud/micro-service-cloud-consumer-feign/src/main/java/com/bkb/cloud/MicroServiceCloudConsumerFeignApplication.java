package com.bkb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.bkb.cloud"})
//@ComponentScan(value = "com.bkb.cloud")
public class MicroServiceCloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerFeignApplication.class, args);
    }
}