package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

//spring boot提供的单元测试，可以很方便的在测试期间di
@SpringBootTest
class ConfigApplicationTests {

    @Autowired
    private Person person;

    //拿到spring ioc容器
    @Autowired
    private ApplicationContext ioc;

    @Test
    public void test01() {
        System.out.println(person);
    }

    @Test
    public void test02(){
        System.out.println(ioc.getClass());//class org.springframework.web.context.support.GenericWebApplicationContext
        boolean flag = ioc.containsBean("helloService007");
        System.out.println(flag);
    }

}
