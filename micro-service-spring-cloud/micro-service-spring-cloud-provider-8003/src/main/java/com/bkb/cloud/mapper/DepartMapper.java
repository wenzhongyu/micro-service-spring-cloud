package com.bkb.cloud.mapper;

import com.bkb.cloud.entity.Depart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartMapper {

    List<Depart> findAll();

    Depart findDepartById(Long id);

    int insertDepart(Depart Depart);

    int updateDepart(Depart Depart);

    int deleteDepartById(Long id);
}
