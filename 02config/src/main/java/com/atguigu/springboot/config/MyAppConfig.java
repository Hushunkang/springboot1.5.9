package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日
 */
@Configuration//表示当前类是一个配置类，用于替换传统的spring的xml配置文件，并且自身就是一个组件
public class MyAppConfig {

    @Bean//表示向spring ioc容器里面注册HelloService这个组件，这个组件的名称就是方法名
    public HelloService helloService007(){
        return new HelloService();
    }

}
