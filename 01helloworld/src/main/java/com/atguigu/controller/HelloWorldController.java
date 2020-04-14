package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello,world!";
    }

}
