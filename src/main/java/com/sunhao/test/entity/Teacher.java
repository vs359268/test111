package com.sunhao.test.entity;

import lombok.Data;

@Data
public class Teacher {
    private Long id;
    private String name;
    private Integer sex;
    private String username;
    private String email;
    private Long createTime;
    private Long updateTime;
}
