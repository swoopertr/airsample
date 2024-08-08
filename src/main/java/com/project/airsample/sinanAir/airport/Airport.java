package com.project.airsample.sinanAir.airport;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("SinanAirport")
public class Airport {
    private String name;
    private String city;
    private String country;
    private int code;


    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCode(int code) {
        this.code = code;
    }


}
