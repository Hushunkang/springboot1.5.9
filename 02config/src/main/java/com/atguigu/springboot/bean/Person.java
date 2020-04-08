package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
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
public class Person {

    private String lastName;
    private Integer age;
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

}
