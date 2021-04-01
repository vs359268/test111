package com.sunhao.test.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@MapperScan("com.sunhao.test.mapper")
@Configuration
public class StudentConfig {
}
