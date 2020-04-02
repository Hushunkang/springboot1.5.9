package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月02日 11时55分00秒
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello，努力学习，认真工作。。。";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好...");
        //classpath:/templates/success.html
        return "success";
    }

}
