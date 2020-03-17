package com.bkb.cloud.controller;


import com.bkb.cloud.entity.Depart;
import com.bkb.cloud.service.DepartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartController {

    @Autowired
    private DepartServiceImpl departService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/depart")
    public List<Depart> findAll() {
        return departService.findAll();
    }

    @GetMapping(value = "/depart/{id}")
    public Depart findDepartById(@PathVariable("id") Long id) {
        return departService.findDepartById(id);
    }

    @PostMapping(value = "/depart")
    public Depart addDept(@RequestBody Depart depart) {
        departService.insertDepart(depart);
        return depart;
    }

    @PutMapping(value = "/depart")
    public Integer updateDept(@RequestBody Depart depart) {
        return departService.updateDepart(depart);
    }

    @DeleteMapping(value = "/depart/{id}")
    public Integer deleteDepartById(@PathVariable("id") Long id) {
        return departService.deleteDepartById(id);
    }

    @GetMapping(value = "/discovery")
    public List<ServiceInstance> discovery() {
        List<ServiceInstance> services = discoveryClient.getInstances("micro-service-spring-cloud-PROVIDER-8001");
        System.out.println("*********" + services);
        for (ServiceInstance service: services) {
            System.out.println(service.getHost() + " ---- "+ service.getPort() + " --- " + service.getUri() + " ------ " + service.getServiceId());
        }
        return services;
    }
}
