package com.lxx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 16:28
 * @since JDK 1.8
 */
@Component
//@ConfigurationProperties(prefix = "author")
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:author.properties")
public class AuthorSettings {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

