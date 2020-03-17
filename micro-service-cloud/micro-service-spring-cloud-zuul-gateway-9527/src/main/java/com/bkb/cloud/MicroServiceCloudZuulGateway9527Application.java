package com.bkb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroServiceCloudZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudZuulGateway9527Application.class, args);
    }

}
