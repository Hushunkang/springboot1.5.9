package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication注解 来标注一个主程序类，说明这是一个Spring Boot应用
 */

@SpringBootApplication//此注解用来标识一个spring boot主程序类，说明这是一个spring boot应用
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //让spring boot应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }

}
