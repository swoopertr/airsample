package com.project.airsample.elifAir;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class ElifHuman implements IAdvantageProgram{

    private String name;
    private String surname;
    private Date birthdate;

    //constructor yazmamız gerekiyor. boş olabilir
    public ElifHuman(){
        this.name = "";
        this.surname ="";
        birthdate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirtdate() {
        return birthdate;
    }

    public void setBirtdate(Date birtdate) {
        this.birthdate = birtdate;
    }

    @Override
    public int counter() {
        return 0;
    }
}