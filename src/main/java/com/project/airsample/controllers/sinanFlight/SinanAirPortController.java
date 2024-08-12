package com.project.airsample.controllers.sinanFlight;

import com.project.airsample.sinanAir.airport.AirPortList;
import com.project.airsample.sinanAir.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/sinan/airport")
public class SinanAirPortController {

    @Autowired
    private AirPortList gokalpAirports;

    @GetMapping("/")
    public ArrayList<Airport> getAirport() {
        return gokalpAirports.getAirports();
    }

    @PostMapping("/")
    public Airport addAirport(@RequestBody Airport airport) {
        gokalpAirports.addAirport(airport);
        return airport;
    }

}
