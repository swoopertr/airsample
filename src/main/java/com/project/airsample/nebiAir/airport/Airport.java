package com.project.airsample.nebiAir.airport;

import org.springframework.stereotype.Component;

@Component("nebiAirport")
public class Airport {
    private String name;
    private String city;
    private String country;
    private int code;

    // Constructors
    public Airport() {
        this.name = "Not Set";
        this.city = "Not Set";
        this.country = "Not Set";
        this.code = -1;
    }

    public Airport(String name, String city, String country, int code) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.code = code;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // DB operations (dummy implementations)



    public String getDb() {
        // TODO: Implement logic to get data from DB
        return "Database details"; // Example return
    }

    public Airport getById(int id) {
        // TODO: Get airport data from DB by ID
        return new Airport(); // Example return
    }

    public boolean insertDb(Airport entity) {
        // TODO: Insert into DB with given airport parameter
        return true;
    }

    public boolean updateDb(Airport entity) {
        // TODO: Update into DB with given airport parameter
        return true;
    }

    public boolean deleteDb(int id) {
        // TODO: Delete airport with given ID
        return true;
    }
}
