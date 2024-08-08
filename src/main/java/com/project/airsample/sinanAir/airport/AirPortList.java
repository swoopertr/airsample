package com.project.airsample.sinanAir.airport;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AirPortList {
    private ArrayList<Airport> airports = new ArrayList<Airport>();

    public ArrayList<Airport> getAirports() {

        return airports;
    }

    public void addAirport(Airport airport) {
        airports.add(airport);
    }
}
