package com.atguigu.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月09日
 */
//spring boot提供的单元测试，可以很方便的在测试期间di
@SpringBootTest
public class LoggingApplicationTests {

    //日志记录器
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Logger logger = LoggerFactory.getLogger(getClass());
//    private Logger logger = LoggerFactory.getLogger(LoggingApplicationTests.class);

    @Test
    public void test01(){
        //日志级别由低到高，日志级别越低，最终打印的信息越多(*￣︶￣)
        logger.trace("这是trace日志。。。");
        logger.debug("这是debug日志。。。");
        //spring boot2.2.1版本默认的日志级别为info级别
        //没有在配置文件中显式的指明日志的级别就使用默认的日志级别，默认root级别规定成info级别
        logger.info("这是info日志。。。");
        logger.warn("这是warn日志。。。");
        logger.error("这是error日志。。。");
    }

}
