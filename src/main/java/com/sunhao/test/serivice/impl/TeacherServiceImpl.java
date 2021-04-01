package com.sunhao.test.serivice.impl;

import com.sunhao.test.entity.Teacher;
import com.sunhao.test.mapper.TeacherMapper;
import com.sunhao.test.serivice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> getAll() {
        return  teacherMapper.findAll();
    }

    @Override
    public void save(Teacher teacher) {
        teacherMapper.save(teacher);
    }

    @Override
    public Teacher getById(Long id) {
        Teacher teacher=teacherMapper.getById(id);
        return teacher;
    }
}
