package com.project.airsample.controllers;

import com.project.airsample.sinanAir.airport.AirPortList;
import com.project.airsample.sinanAir.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/sinan")
public class SinanController {

    @GetMapping("/")
    public String Starter(){
        return  "SinanAir is active";
    }

    @Autowired
    private AirPortList airports;

    private AirPortList airports2;

    @Autowired
    public SinanController(AirPortList airports2) {
        this.airports2 = airports2;
    }

    @GetMapping("/airport")
    public ArrayList<Airport> getAirport() {
        return airports.getAirports();
    }
    @GetMapping("/airport2")
    public ArrayList<Airport> getAirport2() {
        return airports2.getAirports();
    }

    @PostMapping("/airport")
    public Airport addAirport(@RequestBody Airport airport){
        airports.addAirport(airport);
        return  airport;
    }
}
