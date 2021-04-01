package com.sunhao.test.mapper;

import com.sunhao.test.entity.School;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SchoolMapper {
    List<School> findAllSchool();

}
