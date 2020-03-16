package com.bkb.cloud.service;

import com.bkb.cloud.entity.Depart;
import com.bkb.cloud.mapper.DepartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements IDepartService {
    @Autowired
    private DepartMapper departMapper;

    @Override
    public List<Depart> findAll() {
        return departMapper.findAll();
    }

    @Override
    public Depart findDepartById(Long id) {
        return departMapper.findDepartById(id);
    }

    @Override
    public int insertDepart(Depart depart) {
        return departMapper.insertDepart(depart);
    }

    @Override
    public int updateDepart(Depart depart) {
        return departMapper.updateDepart(depart);
    }

    @Override
    public int deleteDepartById(Long id) {
        return departMapper.deleteDepartById(id);
    }
}
