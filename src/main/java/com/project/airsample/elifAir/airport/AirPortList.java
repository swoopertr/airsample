package com.project.airsample.elifAir.airport;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component("elifAirPortList")
public class AirPortList {
    private ArrayList<Airport> airports = new ArrayList<Airport>();

    public ArrayList<Airport> getAirports(){
        //todo: get all airports from db.
        return airports;
    }
}
