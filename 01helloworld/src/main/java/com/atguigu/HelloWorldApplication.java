package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日 15时20分58秒
 */
@SpringBootApplication//用于标识spring boot主程序类，表明这是一个spring boot应用
public class HelloWorldApplication {

    public static void main(String[] args) {
        //将spring boot应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }

    //解释@SpringBootApplication注解：
    /**
     * @Target(ElementType.TYPE)
     * @Retention(RetentionPolicy.RUNTIME)
     * @Documented
     * @Inherited
     * @SpringBootConfiguration 和@Configuration注解一样，只不过这个是spring boot提供的注解，@Configuration注解是spring提供的注解
     * @EnableAutoConfiguration 告诉spring boot开启自动配置功能，这样自动配置才能生效
     *                          其实spring框架里面有很多的@Enable***注解，这一类注解的功能类似，就是开启***，让***生效
     *                          比如说：开启基于注解的aop模式，需要使用@EnableAspectJAutoProxy注解
                             @Target(ElementType.TYPE)
                             @Retention(RetentionPolicy.RUNTIME)
                             @Documented
                             @Inherited
                             @AutoConfigurationPackage 自动配置包
                                 @Target(ElementType.TYPE)
                                 @Retention(RetentionPolicy.RUNTIME)
                                 @Documented
                                 @Inherited
                                 @Import(AutoConfigurationPackages.Registrar.class) 向spring ioc容器中注册组件的四大方式之一@Import注解（具体使用又有三种用法），可以参照官方文档
                                 调试Registrar类相关源码可以发现，这个注解的作用就是将spring boot主程序类所在包及其子包下面的组件扫描到spring ioc容器里面
                                 这些组件（Bean）交给spring ioc容器来管理
                             @Import(AutoConfigurationImportSelector.class) 又是使用@Import注解向spring ioc容器中注册组件
                             AutoConfigurationImportSelector类表示自动配置导入哪些组件的选择器，调试里面的selectImports
                             你会发现它的效果就是在程序启动的时候，spring boot帮我们在spring ioc容器里面注册了很多***AutoConfiguration
                             这种类型的组件
                             （
                             一般地，spring boot应用启动的时候具体导入哪些组件呢？
                             其实在spring boot的自动配置的jar类路径下的spring.factories文件中找到答案，这些结论都可以通过源码调试分析得到
                             ）
     * @ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
     *                @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
     */

    //总结：spring boot通过一系列黑箱操作，在spring boot应用启动的时候，向spring ioc容器里面注册很多自动配置类
    //     当应用程序需要这些Bean（自动配置类）的时候，di即可，免去了我们手动编写配置文件、di等工作

}
