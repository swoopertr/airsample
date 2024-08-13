package com.project.airsample.sinanAir.airport;

import com.project.airsample.sinanAir.interfaces.IAirport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("SinanAirport")
public class Airport implements IAirport {
    private String name;
    private String city;
    private String country;
    private int code;

    //constructers
    public Airport() {
        name = "sinan";
        code = 365;
        city = "İstanbul";
        country = "Turkey";

    }

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


    @Override
    public Airport getAirportByCode(int code) {
        //todo: buraya database'den filtreleme eklenecek
        //todo: new airport dğeil database'de bulunan airport return edilmeli
        return new Airport();
    }

    @Override
    public List<Airport> getAllAirports() {
        //todo: burada database'den gelen airport array return edilecek
        return new ArrayList<>();
    }

    @Override
    public boolean addAirport(Airport airport) {
        //todo: burada database'e airport gönderilmeli
        return false;
    }

    @Override
    public boolean updateAirport(Airport airport) {
        //todo: burada database'e güncel airport gönderilmeli
        return false;
    }

    @Override
    public boolean deleteAirport(int code) {
        //todo: burada database'den ilgili airport silinmeli/silindi işaretlenmeli
        return false;
    }
}
