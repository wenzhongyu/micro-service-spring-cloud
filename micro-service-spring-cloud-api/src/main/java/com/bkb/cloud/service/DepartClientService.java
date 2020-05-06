package com.bkb.cloud.service;

import com.bkb.cloud.entity.Depart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "micro-service-spring-cloud-provider", path = "/provider")//, fallbackFactory = DepartClientServiceFallbackFactory.class)
public interface DepartClientService {

    @RequestMapping(value = "/depart", method = RequestMethod.GET)
    List<Depart> findAll();

    @RequestMapping(value = "/depart/{id}", method = RequestMethod.GET)
    Depart findDepartById(@PathVariable("id") Long id);

    @RequestMapping(value = "/depart", method = RequestMethod.POST)
    int insertDepart(Depart depart);

    @RequestMapping(value = "/depart", method = RequestMethod.PUT)
    int updateDepart(Depart depart);

    @RequestMapping(value = "/depart/{id}", method = RequestMethod.DELETE)
    int deleteDepartById(@PathVariable("id") Long id);
}
