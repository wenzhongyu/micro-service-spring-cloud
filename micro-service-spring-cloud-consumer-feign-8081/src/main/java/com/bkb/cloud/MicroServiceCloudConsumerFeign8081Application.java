package com.bkb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.bkb.cloud"})
//@ComponentScan(value = "com.bkb.cloud")
public class MicroServiceCloudConsumerFeign8081Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerFeign8081Application.class, args);
    }
}
