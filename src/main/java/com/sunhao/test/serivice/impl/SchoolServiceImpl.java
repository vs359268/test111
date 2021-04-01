package com.sunhao.test.serivice.impl;

import com.sunhao.test.entity.School;
import com.sunhao.test.entity.Student;
import com.sunhao.test.mapper.SchoolMapper;
import com.sunhao.test.mapper.StudentMapper;
import com.sunhao.test.serivice.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<School> findAll() {
        List<School> listSchool=schoolMapper.findAllSchool();
        List<Student> allStudents = studentMapper.findAll();
        for (int i = 0; i < listSchool.size(); i++) {
            School school = listSchool.get(i);
            List<Student> list = new ArrayList<>();
            for (int i1 = 0; i1 < allStudents.size(); i1++) {
                Student student = allStudents.get(i1);
                if(school.getSchoolId().equals(student.getSchoolId())){
                    list.add(student);
                }
            }
            school.setStudentList(list);
        }
//        Map<Integer, School> hashMap = new HashMap<>();
//        for (int i = 0; i < listSchool.size(); i++) {
//            hashMap.put(listSchool.get(i).getSchoolId(),listSchool.get(i));
//        }
//        for (int i = 0; i < allStudents.size(); i++) {
//            hashMap.get(allStudents.get(i).getSchoolId()).
//        }
        return listSchool;
    }
}
