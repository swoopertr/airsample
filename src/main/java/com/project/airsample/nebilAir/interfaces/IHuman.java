package com.project.airsample.nebilAir.interfaces;

import java.util.Date;

public interface IHuman {

    public String getName();
    public String getSurname();
    public Date getBirthDate();
    public int getAge();
    public void setName(String name);
    public void setSurname(String surname);
    public void setBirthDate(Date birthDate);
}
