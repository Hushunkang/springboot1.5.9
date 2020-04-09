package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月09日 18时42分09秒
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired//为啥这里可以直接di，肯定是因为spring boot提前已经帮我们给这个组件注册到spring ioc容器里面去了
    //道理很简单，你要从容器里面拿一个东西，之前必须做的一件事情就是给容器里面放东西
    private JdbcTemplate jdbcTemplate;//spring提供的原生的jdbc之JdbcTemplate类

    @RequestMapping("hello")
    public Map<String, Object> hello(){
        List<Map<String, Object>> teachers = jdbcTemplate.queryForList("select * from edu_teacher");
        Map<String, Object> result = teachers.get(0);
        return result;
    }

}
