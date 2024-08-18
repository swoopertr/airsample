package com.project.airsample.nebiAir.airport;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("nebiAirPortList")
public class AirportList {
    private ArrayList<Airport> airports = new ArrayList<Airport>();

    public ArrayList<Airport> getAirports() {
        //todo: get all airports from db.
        return airports;

    }
}




