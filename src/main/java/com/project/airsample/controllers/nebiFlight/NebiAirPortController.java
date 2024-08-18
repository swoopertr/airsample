package com.project.airsample.controllers.nebiFlight;

import com.project.airsample.nebiAir.airport.Airport;
import com.project.airsample.nebiAir.airport.AirportList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nebiAir/airport")
public class NebiAirPortController {

    @Autowired
    @Qualifier("nebiAirport")
    private Airport nebiAirport;

    @Autowired
    @Qualifier("nebiAirPortList")
    private AirportList nebiAirportList;


    // Get  airports schema
    @GetMapping({"", "/"})
    public Airport getAirport() {
        return nebiAirport;
    }

    // Get all airports
    @GetMapping("/list")
    public AirportList getAirports() {
        return nebiAirportList;
    }

    // Get airport by ID
    @GetMapping("/{id}")
    public Airport getAirport(@PathVariable int id) {
        return nebiAirport.getById(id); // No need for cast
    }

    // Save a new airport
    @PostMapping("/")
    public boolean saveAirport(@RequestBody Airport airport) {
        return nebiAirport.insertDb(airport);
    }

    // Update an existing airport
    @PutMapping("/")
    public boolean updateAirport(@RequestBody Airport airport) {
        return nebiAirport.updateDb(airport);
    }

    // Delete an airport
    @DeleteMapping("/{id}")
    public boolean deleteAirport(@PathVariable int id) {
        return nebiAirport.deleteDb(id);
    }
}
