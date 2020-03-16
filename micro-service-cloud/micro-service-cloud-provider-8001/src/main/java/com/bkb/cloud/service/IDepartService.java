package com.bkb.cloud.service;

import com.bkb.cloud.entity.Depart;

import java.util.List;

public interface IDepartService {
    List<Depart> findAll();

    Depart findDepartById(Long id);

    int insertDepart(Depart depart);

    int updateDepart(Depart depart);

    int deleteDepartById(Long id);
}
