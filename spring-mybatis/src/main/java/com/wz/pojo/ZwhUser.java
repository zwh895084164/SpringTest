package com.wz.pojo;

import java.io.Serializable;

public class ZwhUser   {
    private String userId;
    private String name;
    private int sex;
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

    public ZwhUser(String userId, String name, int sex, String pass) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.pass = pass;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
