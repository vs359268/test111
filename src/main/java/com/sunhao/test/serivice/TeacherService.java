package com.sunhao.test.serivice;

import com.sunhao.test.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAll();

    void save(Teacher teacher);

    Teacher getById(Long id);
}
