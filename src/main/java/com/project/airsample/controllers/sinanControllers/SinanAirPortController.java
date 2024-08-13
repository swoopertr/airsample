package com.project.airsample.controllers.sinanControllers;

import com.project.airsample.sinanAir.airport.Airport;
import com.project.airsample.sinanAir.interfaces.IAirport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinan/airport")
public class SinanAirPortController {

    @Autowired
    @Qualifier("SinanAirport")
    private IAirport airport;

    @GetMapping({"", "/"})
    public List<Airport> getAllAirports() {
        return airport.getAllAirports();
    }

    @GetMapping("/{code}")
    public Airport getAirPortByCode(@PathVariable int code) {
        return airport.getAirportByCode(code);
    }

    @PostMapping({"", "/"})
    public boolean addAirport(@RequestBody Airport airport) {
        return airport.addAirport(airport);
    }

    @PutMapping({"", "/"})
    public boolean updateAirport(@RequestBody Airport airport) {
        return airport.updateAirport(airport);
    }

    @DeleteMapping("/{code}")
    public boolean deleteAirport(@PathVariable int code) {
        return airport.deleteAirport(code);
    }

}
