package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日 18时07分31秒
 */
@ConfigurationProperties(prefix = "person")//告诉spring boot将本类中的所有属性和spring boot配置文件中对应的属性进行绑定
//prefix = "person"映射的前缀，在配置文件里面以person为前缀的属性里面找，进行映射
@Component//只有当前组件在spring ioc容器中，@ConfigurationProperties注解作用于当前类的作用才可以生效
@PropertySource({"classpath:person.properties"})//加载外部指定的资源文件
//@ConfigurationProperties注解默认加载的是application.properties或者application.yml文件，这两个注解有互补效果
public class Person {

    /**
     * <bean id = person class="com.atguigu.springboot.bean.Person">
     *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     * <bean/>
     */
//    @Value("原汁原味")//spring底层的一个注解，@Value算是一种di的方式
//    @Email//表示lastName必须是邮箱格式，否则校验失败出错，@ConfigurationProperties支持JSR303数据校验，@Value不支持
    private String lastName;

//    @Value("#{2 * 11}")
    private Integer age;

//    @Value("${person.boss}")
    private Boolean boss;
    private Date birth;

    private Dog dog;
    private List<Object> lists;
    private Map<String,Object> maps;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", dog=" + dog +
                ", lists=" + lists +
                ", maps=" + maps +
                '}';
    }

    //说明@ConfigurationProperties和@Value有几点区别，具体可以参照总结的笔记
    //最大的区别在于@ConfigurationProperties能够映射复杂的数据类型（比如Map），@Value不行

}
