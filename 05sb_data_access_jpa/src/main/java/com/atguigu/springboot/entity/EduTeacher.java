package com.atguigu.springboot.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月10日
 */
@Entity//告诉jpa，这是一个和数据库表做映射的实体类
@Table(name="edu_teacher")//当前这个实体类对应了数据库里面的哪张表
//name="edu_teacher"如果省略，则认为对应的表名就是实体类的名称eduteacher
public class EduTeacher {

    @Id//表示这个属性是对应这数据库表的主键字段
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示自增
    private String id;
    @Column//表示这个属性是对应这数据库表的非主键字段/普通字段
    private String name;
    @Column(name = "intro")//不写这个name = "intro"的情况下列名即是属性名
    private String intro;
    @Column
    private String career;
    @Column
    private Integer level;
    @Column
    private String avatar;
    @Column
    private Integer sort;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "gmt_create")
    private Date gmtCreate;
    @Column(name = "gmt_modified")
    private Date gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}
