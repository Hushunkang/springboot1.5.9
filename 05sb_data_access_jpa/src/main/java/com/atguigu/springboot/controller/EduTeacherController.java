package com.atguigu.springboot.controller;

import com.atguigu.springboot.entity.EduTeacher;
import com.atguigu.springboot.repository.EduTeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月10日 01时57分11秒
 */
@RestController
@RequestMapping("/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherRepository eduTeacherRepository;

    @GetMapping("getTeacherById/{id}")
    public EduTeacher getTeacherById(@PathVariable("id") String id){
        Optional<EduTeacher> eduTeacherOptional = eduTeacherRepository.findById(id);
        EduTeacher eduTeacher = eduTeacherOptional.get();
        return eduTeacher;
    }

}
