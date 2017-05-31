package com.starsmobi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by vincent on 2017-05-31.
 */
public class UserModel implements Serializable{

    private static final long serialVersionUID = 5689879564734053933L;

    private String usename;

    private int age;

    private int sex;

    private Date createTime;

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
