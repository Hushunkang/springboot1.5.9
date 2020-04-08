package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日 15时20分58秒
 */
@SpringBootApplication//用于标识spring boot的主程序类，表明这是一个spring boot应用
public class HelloWorldApplication {

    public static void main(String[] args) {
        //将spring boot应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }

}
