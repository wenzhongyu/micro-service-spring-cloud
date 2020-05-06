package com.bkb.hystrix.controller;


import com.bkb.cloud.entity.Depart;
import com.bkb.hystrix.service.DepartServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "processHystrix_get")
    @GetMapping(value = "/depart/{id}")
    public Depart findDepartById(@PathVariable("id") Long id) {
        Depart depart = departService.findDepartById(id);
        if (depart == null) {
            throw new RuntimeException("该ID: " + id + " 没有对应的信息！！！");
        }
        return depart;
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


    public Depart processHystrix_get(Long id) {
        return new Depart().setDeptNo(id).setDeptName("该ID: " + id + "没有d对应的信息！！！ null ---> @HystrixCommand ").setDbSource("no this database in MySQL");
    }

    @GetMapping(value = "/discovery")
    public List<ServiceInstance> discovery() {
        List<ServiceInstance> services = discoveryClient.getInstances("micro-service-spring-cloud-provider-8001");
        System.out.println("*********" + services);
        for (ServiceInstance service: services) {
            System.out.println(service.getHost() + " ---- "+ service.getPort() + " --- " + service.getUri() + " ------ " + service.getServiceId());
        }
        return services;
    }
}
