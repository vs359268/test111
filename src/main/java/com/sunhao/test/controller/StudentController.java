package com.sunhao.test.controller;

import com.sunhao.test.entity.Student;
import com.sunhao.test.serivice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("findStudent/{id}")
    public Student findStudent(@PathVariable Integer id){
        Student student=studentService.findStudent(id);
        return student;
    }
    @PostMapping("addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
