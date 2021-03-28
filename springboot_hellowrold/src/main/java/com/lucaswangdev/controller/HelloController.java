package com.lucaswangdev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: hello控制层
 * @author: kkb
 */
@RestController
public class HelloController {
    @Value("${person.name}")
    private String personName;
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("哈哈哈 " + personName);
        System.out.println("xxx " + personName);
        return "hello, "+name;
    }
}
