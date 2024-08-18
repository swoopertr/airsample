package com.project.airsample.controllers.nebiFlight;


import com.project.airsample.elifAir.interfaces.IPersonnelBussines;
import com.project.airsample.nebiAir.interfaces.IPassenger;
import com.project.airsample.nebiAir.passenger.Passenger;
//import com.project.airsample.nebiAir.passenger.PassengerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nebiAir/passenger")
public class NebiPassengerController {

    private IPassenger nebiPassenger;

    private IPersonnelBussines personnelBussines;


    @Autowired
    public void NebiAirPassengerController(IPassenger passenger, IPersonnelBussines personnelBussines){
        this.nebiPassenger = nebiPassenger;
        this.personnelBussines = personnelBussines;
    }

    @GetMapping("/appliedlogic1")
    public boolean appliedlogic1(){
        //todo: do not apply logic here.
        return personnelBussines.getPassengerByLogic1(1,"city1");
    }


    // Get  passenger schema
    @GetMapping("/passengerSchema")
    public Passenger getPassenger() {
        return (Passenger) nebiPassenger;
    }


    // Get all passengers
    @GetMapping({"", "/"})
    public List<Passenger> getAllPassengers() {
        return nebiPassenger.getAllPassengers();
    }


    // Get passenger by ID
    @GetMapping("/{id}")
    public Passenger getById(@PathVariable int id) {
        return nebiPassenger.getById(id);
    }

    // Save a new passenger
    @PostMapping({"", "/"})
    public boolean insertPassenger(@RequestBody Passenger passenger) {
        return nebiPassenger.addPassenger(passenger);
    }

    // Update an existing passenger
    @PutMapping({"", "/"})
    public boolean updatePassenger(@RequestBody Passenger updatedPassenger) {
        return nebiPassenger.updatePassenger(updatedPassenger);
    }

    // Delete a passenger
    @DeleteMapping("/{id}")
    public boolean deletePassenger(@PathVariable int id) {
        return nebiPassenger.removePassenger(id);
    }
}
