package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月02日 11时55分00秒
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello，努力学习，认真工作。。。";
    }

}
