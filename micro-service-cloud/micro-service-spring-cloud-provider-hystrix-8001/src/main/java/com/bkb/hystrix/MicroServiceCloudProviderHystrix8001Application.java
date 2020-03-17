package com.bkb.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker //对hystrix熔断器的支持
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceCloudProviderHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderHystrix8001Application.class, args);
    }

}
