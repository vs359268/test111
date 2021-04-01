package com.sunhao.test.entity;

import lombok.Data;

import java.util.List;

@Data
public class School {
    private Integer schoolId;
    private String schoolName;
    private List<Student> studentList;
}
