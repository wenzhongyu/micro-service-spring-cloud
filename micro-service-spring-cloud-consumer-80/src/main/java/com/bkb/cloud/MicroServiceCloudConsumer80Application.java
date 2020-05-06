package com.bkb.cloud;

import com.bkb.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "micro-service-spring-cloud-provider", configuration = MySelfRule.class)
public class MicroServiceCloudConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumer80Application.class, args);
    }
}
