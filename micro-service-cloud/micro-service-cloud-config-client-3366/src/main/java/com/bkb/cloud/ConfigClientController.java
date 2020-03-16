package com.bkb.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: " + applicationName + "\n\t eurekaServers:" + eurekaServers + "\n\t port: " + port;
        System.out.println("******str: " + str);
        return "applicationName: " + applicationName + "\n\t eurekaServers:" + eurekaServers + "\n\t port: " + port;
    }
}
