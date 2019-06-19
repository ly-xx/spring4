package com.lxx.config;

/**
 * 用户页面显示
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/5 9:28
 * @since JDK 1.8
 */
public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
