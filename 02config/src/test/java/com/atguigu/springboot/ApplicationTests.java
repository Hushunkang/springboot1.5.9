package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * spring boot单元测试
 *
 * 可以在测试期间很方便的类似编码的方式进行自动注入的功能
 *
 */
@SpringBootTest
class ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void test1(){

        System.out.println(ioc.getClass());//class org.springframework.web.context.support.GenericWebApplicationContext

        boolean flag = ioc.containsBean("helloService02");
        System.out.println(flag);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
