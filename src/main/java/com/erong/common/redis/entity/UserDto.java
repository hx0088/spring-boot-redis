package com.erong.common.redis.entity;

import java.io.Serializable;

public class UserDto implements Serializable {

    private static final long serialVersionUID = -410022550976651940L;

    private String name;
    private String age;

    public UserDto() {
    }

    public UserDto(String name, String age) {
        this.name = name;
        this.age = age;
    }

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
