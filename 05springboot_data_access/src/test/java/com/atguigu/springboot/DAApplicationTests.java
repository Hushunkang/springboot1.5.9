package com.atguigu.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月09日 18时03分35秒
 */
@SpringBootTest
public class DAApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test01() throws SQLException {
        System.out.println(dataSource.getClass());//spring boot2.2.1版本的底层默认使用的数据源是class com.zaxxer.hikari.HikariDataSource
        System.out.println(dataSource.getConnection());//HikariProxyConnection@354154358 wrapping com.mysql.cj.jdbc.ConnectionImpl@5a6d30e2
    }

    //说明：参照DataSourceConfiguration的源码，看看一下子就明白咋流程了，很简单

}
