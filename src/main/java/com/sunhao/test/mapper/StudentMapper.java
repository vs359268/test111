package com.sunhao.test.mapper;

import com.sunhao.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    List<Student> findAll();

    Student findStudent(Integer id);

    void addStudent(Student student);
}
