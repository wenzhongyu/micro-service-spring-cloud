package com.bkb.cloud.service;

import com.bkb.cloud.entity.Depart;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component      //千万不要忘记加此注解
public class DepartClientServiceFallbackFactory implements FallbackFactory<DepartClientService> {
    @Override
    public DepartClientService create(Throwable throwable) {

        return new DepartClientService() {
            @Override
            public List<Depart> findAll() {
                return null;
            }

            @Override
            public Depart findDepartById(Long id) {
                return new Depart().setDeptNo(id)
                        .setDeptName("该ID: " + id + "没有d对应的信息！！！ Consumer客户端提供的降级信息，此刻服务Provider已经关闭！！！ ")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public int insertDepart(Depart depart) {
                return 0;
            }

            @Override
            public int updateDepart(Depart depart) {
                return 0;
            }

            @Override
            public int deleteDepartById(Long id) {
                return 0;
            }
        };
    }
}
