package com.at.ssm.poro;

import java.math.BigDecimal;
import java.util.Date;

public class User {

    Integer id;
    String name;
    String phone;
    String sex;
    Integer age;
    Date created;
    BigDecimal money;

    public User(Integer id, String name, String phone, String sex, Integer age, Date created, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
        this.created = created;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Date getCreated() {
        return created;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}