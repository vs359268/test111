package com.sunhao.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    @GetMapping("helloWorld")
    public String hello(){
        return "{\"message\": \"Hello 111\"}";
    }
}
