package com.sunhao.test.serivice;

import com.sunhao.test.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> findAll();

    Student findStudent(Integer id);

    void addStudent(Student student);
}
