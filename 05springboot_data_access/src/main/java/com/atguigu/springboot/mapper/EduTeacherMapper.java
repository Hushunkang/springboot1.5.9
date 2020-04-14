package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.EduTeacher;
import org.apache.ibatis.annotations.Select;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月09日
 */
//@Mapper//因为用了@MapperScan批量扫描并向spring ioc容器里面注册组件
public interface EduTeacherMapper {

    @Select("select * from edu_teacher where id=#{id}")
    EduTeacher getTeacherById(String id);

}
