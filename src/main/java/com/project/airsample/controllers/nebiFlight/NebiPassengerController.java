package com.project.airsample.controllers.nebiFlight;

import com.project.airsample.nebilAir.passenger.Passenger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nebiAir/passenger")
public class NebiPassengerController {

    // Get all passengers
    @GetMapping("/list")
    public List<Passenger> getPassengers() {
        return Passenger.getAllPassengers();
    }

    // Get passenger by ID
    @GetMapping("/{id}")
    public Passenger getPassenger(@PathVariable int id) {
        return Passenger.getById(id);
    }

    // Save a new passenger
    @PostMapping("/")
    public boolean savePassenger(@RequestBody Passenger newPassenger) {
        return Passenger.addPassenger(newPassenger);
    }

    // Update an existing passenger
    @PutMapping("/")
    public boolean updatePassenger(@RequestBody Passenger updatedPassenger) {
        return Passenger.updatePassenger(updatedPassenger);
    }

    // Delete a passenger
    @DeleteMapping("/{id}")
    public boolean deletePassenger(@PathVariable int id) {
        return Passenger.removePassenger(id);
    }
}
