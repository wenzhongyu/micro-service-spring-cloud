package com.bkb.cloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Depart implements Serializable {
    private Long deptNo;
    private String deptName;
    private String dbSource;

}
