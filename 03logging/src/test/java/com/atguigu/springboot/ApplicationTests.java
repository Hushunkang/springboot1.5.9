package com.atguigu.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

    @Test
    void contextLoads() {

    }

}

class A{

    public int age = 10;

    public int getAge(){
        return age;
    }

}

class B extends A{

    public int age = 5;

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new B();
        B o3 = new B();
        System.out.println(o1.age);//10
        System.out.println(o2.age);//属性没有重写这么一说，编译运行都看左边，因此结果10
        System.out.println(o3.age);//5
    }

}
