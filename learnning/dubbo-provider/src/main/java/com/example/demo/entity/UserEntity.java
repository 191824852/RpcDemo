package com.example.demo.entity;

import java.io.Serializable;

/**
 * 创建时间 2018年九月18日 星期二 15:37
 * 作者: zhangjunping
 */
public class UserEntity implements Serializable{

    private static final long serialVersionUID = 999861692305194974L;

    private String userName;
    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
