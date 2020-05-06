package com.bkb.cloud.task;

import com.bkb.cloud.entity.Depart;
import com.bkb.cloud.service.DepartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class AddTask {

    @Autowired
    private DepartServiceImpl departService;

    @Scheduled(cron = "0 40 20 * * *")
    public void addDept() {
        Depart depart = new Depart();

        for (int i = 100000; i < 5000000; i++) {
            depart.setDeptNo((long) i);
            depart.setDeptName("AAA" + i);

            departService.insertDepart(depart);

        }
    }
}
