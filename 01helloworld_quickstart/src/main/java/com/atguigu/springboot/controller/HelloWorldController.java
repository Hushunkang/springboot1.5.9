package com.atguigu.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello,world!";
    }

}
