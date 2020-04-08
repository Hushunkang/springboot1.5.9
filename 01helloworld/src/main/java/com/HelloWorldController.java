package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日 15时23分57秒
 */
@RestController
@RequestMapping("/helloworld2")
public class HelloWorldController {

    @RequestMapping("hello2")
    public String hello(){
        return "Hello,world!";
    }

    //错误，这个组件不会被扫描到，即使你配置@RestController注解，这个组件也不会被加入到spring ioc容器里面
    //从而这个Bean不被spring ioc容器管理，你要用这个Bean的对象实例的时候，一般就要
    //自己动手，丰衣足食了（可以理解成手动new的方式）

}
