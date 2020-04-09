package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.EduTeacher;
import com.atguigu.springboot.mapper.EduTeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月09日 20时43分30秒
 */
@RestController
@RequestMapping("/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherMapper eduTeacherMapper;

    @GetMapping("getTeacherById/{id}")
    public EduTeacher getTeacherById(@PathVariable("id") String id){
        return eduTeacherMapper.getTeacherById(id);
    }

}
