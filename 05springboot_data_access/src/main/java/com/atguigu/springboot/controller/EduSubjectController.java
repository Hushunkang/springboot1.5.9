package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.EduSubject;
import com.atguigu.springboot.mapper.EduSubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月10日
 */
@RestController
@RequestMapping("/subject")
public class EduSubjectController {

    @Autowired
    private EduSubjectMapper eduSubjectMapper;

    @GetMapping("getSubjectById/{id}")
    public EduSubject getSubjectById(@PathVariable("id") String id){
        return eduSubjectMapper.getSubjectById(id);
    }

}
