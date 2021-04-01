package com.sunhao.test.mapper;


import com.sunhao.test.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherMapper {
    List<Teacher> findAll();

    void save(Teacher teacher);

    Teacher getById(Long id);
}
