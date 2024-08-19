package com.project.airsample.sinanAir.base;

import com.project.airsample.sinanAir.interfaces.IHuman;

import java.util.Date;

public class Human implements IHuman {
    private int humanId;
    private String name;
    private String surname;
    private Date birthdate;


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Date getBirthDate() {
        return birthdate;
    }
    public int getAge() {
        return birthdate.getYear() - new Date().getYear();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getHumanId() {
        return humanId;
    }

    public void setHumanId(int humanId) {
        this.humanId = humanId;
    }
}
