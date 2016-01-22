package com.lvmama.scs.learnannotation.beans;

import com.lvmama.scs.learnannotation.enumerations.Gender;

import javax.validation.constraints.NotNull;

/**
 * 用户类
 * Created by sunchuansheng on 2015/12/30.
 */
public class User {

    @NotNull
    private String lastName; // 姓氏

    @NotNull
    private String firstName; // 名字

    private int age;     // 年龄

    private Gender gender; // 性别


    private String email; // 邮箱地址

    public User() {
    }

    public User(String lastName, String firstName, int age, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
