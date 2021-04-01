package com.sunhao.test.controller;

import com.google.common.annotations.GwtCompatible;
import com.sunhao.test.entity.Teacher;
import com.sunhao.test.serivice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("getAllTeacher")
    public List<Teacher> getAll() {
        List<Teacher> teachers = new ArrayList<>();
        teachers=teacherService.getAll();
        return teachers;
    }
    @PostMapping("addTeacher")
    public void save(@RequestBody Teacher teacher) {
        teacherService.save(teacher);
    }
    @GetMapping("{id}")
    public Teacher getById(@PathVariable Long id) {
        Teacher teacher=teacherService.getById(id);
        System.out.println(teacher);
        return teacher;
    }

    public static void main(String[] args) {
        System.out.println(" I am master");
    }

    @PostMapping("updateTeacher")
    public void update(@RequestBody Teacher teacher){
        teacherService.save(teacher);
    }
}
