package com.lucaswangdev;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lucaswangdev.mapper")
public class SpringbootMybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisTestApplication.class, args);
    }

}
