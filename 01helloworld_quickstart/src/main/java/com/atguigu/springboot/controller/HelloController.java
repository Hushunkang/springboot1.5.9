package com.atguigu.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//组合注解@Controller+@ResponseBody两个作用
//这个类的所有方法的返回数据直接写给浏览器，响应的数据格式为json
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }

}
