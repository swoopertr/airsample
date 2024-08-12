package com.project.airsample.controllers.EgoController;



import com.project.airsample.airEgo.Interfaces.IAirport;
import com.project.airsample.sinanAir.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {

    private final IAirport airportService;

    @Autowired
    public AirportController(IAirport airportService) {
        this.airportService = airportService;
    }

    @PostMapping("/create")
    public Airport createAirport(@RequestBody Airport airport) {
        return airportService.createAirport(airport);
    }

    @GetMapping("/{id}")
    public Airport getAirportById(@PathVariable Long id) {
        return airportService.getAirportByIdEgo(id);
    }

    @GetMapping("/all")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirportsEgo();
    }

    @PutMapping("/update/{id}")
    public Airport updateAirport(@PathVariable Long id, @RequestBody Airport airport) {
        return airportService.updateAirport(id, airport);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAirport(@PathVariable Long id) {
        airportService.deleteAirport(id);
    }
}
