package com.sunhao.test.serivice.impl;

import com.sunhao.test.entity.Student;
import com.sunhao.test.mapper.StudentMapper;
import com.sunhao.test.serivice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findStudent(Integer id) {
        return studentMapper.findStudent(id);
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
}
