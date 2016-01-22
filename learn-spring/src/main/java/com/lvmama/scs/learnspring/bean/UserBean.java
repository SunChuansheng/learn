package com.lvmama.scs.learnspring.bean;

import java.time.LocalDate;

/**
 * 用户类
 *
 * Created by sunchuansheng on 2016/1/22.
 */
public class UserBean {

    private String name;
    private Gender gender;
    private LocalDate birthday;
    private String loginName;
    private String loginPwd;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public enum Gender{
        MALE,   // 男性
        FEMALE, // 女性
        OTHER   // 其他
    }
}
