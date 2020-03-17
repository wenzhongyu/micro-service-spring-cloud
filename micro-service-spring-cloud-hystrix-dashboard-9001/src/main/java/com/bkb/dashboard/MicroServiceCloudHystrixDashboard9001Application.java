package com.bkb.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class MicroServiceCloudHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudHystrixDashboard9001Application.class, args);
    }

//    @Bean
//    public ServletRegistrationBean hystrixMetricsStreamServlet() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
//        registration.addUrlMappings("/hystrix.stream");
//        return registration;
//    }

}
