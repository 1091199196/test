package com.zf.world.ic.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userName;
    private String userAge;
    private Date birthday;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public User() {
        super();
    }
}
