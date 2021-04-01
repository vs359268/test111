package com.sunhao.test.controller;

import com.sunhao.test.entity.School;
import com.sunhao.test.entity.Student;
import com.sunhao.test.serivice.SchoolService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;
    @ApiOperation("查询所有学校")
    @GetMapping("findAll")
    public List<School> findAll(){
        return schoolService.findAll();
    }
}
