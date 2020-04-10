package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月10日 08时52分14秒
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    //调试源码总结：spring boot2.2.1应用启动原理
    //第一步：创建SpringApplication，通过一系列方法调用deduce到我这个spring boot应用的主程序类是哪个
    //       还有推断出你这个spring boot应用的类型
    //    private Class<? extends StandardEnvironment> deduceEnvironmentClass() {
    //        switch (this.webApplicationType) {
    //            case SERVLET:
    //                return StandardServletEnvironment.class;
    //            case REACTIVE:
    //                return StandardReactiveWebEnvironment.class;
    //            default:
    //                return StandardEnvironment.class;
    //        }
    //    }
    //还有做了一些其它的事儿，最后创建了SpringApplication类的对象实例
    //第二步：启动spring boot应用

}
