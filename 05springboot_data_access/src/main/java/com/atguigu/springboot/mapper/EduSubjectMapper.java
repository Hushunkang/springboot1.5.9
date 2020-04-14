package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.EduSubject;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月09日
 */
//@Mapper//这个注解的作用和@MapperScan注解的作用一样，只是MapperScan是批量的
//@MapperScan注解的作用，是批量扫描mybatis的dao层的所以mapper接口
//底层jdk动态代理生成了这些接口的实现类，生成了代理的对象实例（真正工作的是这个）
//并且将这个bean注册到spring ioc容器里面
public interface EduSubjectMapper {

    EduSubject getSubjectById(String id);

}
