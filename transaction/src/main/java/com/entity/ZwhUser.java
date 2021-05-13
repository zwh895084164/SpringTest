package com.entity;

import lombok.Data;

@Data
public class ZwhUser {
    private String userId;
    private String name;
    private Integer sex;
    private String pass;

    @Override
    public String toString() {
        return "ZwhUser{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", pass='" + pass + '\'' +
                '}';
    }
}
