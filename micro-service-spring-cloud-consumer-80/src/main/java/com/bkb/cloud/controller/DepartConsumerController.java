package com.bkb.cloud.controller;

import com.bkb.cloud.entity.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DepartConsumerController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://micro-service-spring-cloud-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/depart")
    public List<Depart> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/depart", List.class);
    }

    @GetMapping(value = "/depart/{id}")
    public Depart findById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/depart/" + id, Depart.class);
    }

    @PostMapping(value = "/depart")
    public Depart addDept(Depart depart) {
        restTemplate.postForObject(REST_URL_PREFIX + "/provider/depart", depart, Depart.class);
        return depart;
    }

    @PutMapping(value = "/depart")
    public Depart updateDept(Depart depart) {
        restTemplate.put(REST_URL_PREFIX + "/provider/depart", depart);
        return depart;
    }

    @DeleteMapping(value = "/depart/{id}")
    public Long deleteDept(@PathVariable("id") Long id) {
        restTemplate.delete(REST_URL_PREFIX + "/provider/depart/" + id);
        return id;
    }

    @GetMapping(value = "/discovery")
    public List<ServiceInstance> discovery() {
        List<ServiceInstance> serviceInstances = restTemplate.getForObject(REST_URL_PREFIX + "/provider/discovery", List.class);
        return serviceInstances;
    }
}
