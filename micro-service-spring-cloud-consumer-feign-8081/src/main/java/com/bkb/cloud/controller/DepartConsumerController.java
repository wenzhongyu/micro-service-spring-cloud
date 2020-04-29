package com.bkb.cloud.controller;

import com.bkb.cloud.entity.Depart;
import com.bkb.cloud.service.DepartClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartConsumerController {

    @Autowired
    private DepartClientService departClientService;

    @RequestMapping(value = "/depart", method = RequestMethod.GET)
    public List<Depart> findAll() {
        return departClientService.findAll();
    }

    @RequestMapping(value = "/depart/{id}", method = RequestMethod.GET)
    public Depart findById(@PathVariable("id") Long id) {
        return departClientService.findDepartById(id);
    }

    @RequestMapping(value = "/depart", method = RequestMethod.POST)
    public Depart addDept(Depart depart) {
        departClientService.insertDepart(depart);
        return depart;
    }

    @RequestMapping(value = "/depart", method = RequestMethod.PUT)
    public Depart updateDept(Depart depart) {
        departClientService.updateDepart(depart);
        return depart;
    }

    @RequestMapping(value = "/depart/{id}", method = RequestMethod.DELETE)
    public Long deleteDept(@PathVariable("id") Long id) {
        departClientService.deleteDepartById(id);
        return id;
    }
}
