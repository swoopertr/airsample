package com.project.airsample.controllers.elifFlight;

import com.project.airsample.elifAir.IPassenger;
import com.project.airsample.elifAir.Passenger;
import com.project.airsample.elifAir.interfaces.IPersonnelBussines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/elifAir/passenger")
public class ElifAirPassengerController {

    private static int counter;

    //@Autowired
    private IPassenger passenger;


    private IPersonnelBussines personnelBussines;

    @Autowired
    public ElifAirPassengerController(IPassenger passenger, IPersonnelBussines personnelBussines){

        this.passenger = passenger;
        this.personnelBussines = personnelBussines;
    }

    @GetMapping("/appliedlogic1")
    public boolean appliedlogic1(){
        //todo: do not apply logic here.
        return personnelBussines.getPassengerByLogic1(1,"city1");
    }

    @GetMapping("/getcounter")
    public int getCounter(){
        return counter;
    }

    @GetMapping({"/{id}"})
    public Passenger getById(@PathVariable int id){
        counter++;
        return passenger.getById(id);
    }

    @GetMapping("/age")
    public List<Passenger> getPassengersGreaterThenAge(@PathVariable int age){
        return passenger.getAll();
    }

    @GetMapping({"","/"})
    public List<Passenger> getAll(){
        return passenger.getAll();
    }

    @PostMapping({"", "/"})
    public boolean insertPassenger(@RequestBody Passenger passenger){
        return passenger.insertPassenger(passenger);
    }

    @PutMapping({"", "/"})
    public boolean updatePassenger(@RequestBody Passenger passenger){
        return passenger.updatePassenger(passenger);
    }

    @DeleteMapping("/{id}")
    public boolean deletePassenger(@PathVariable int id){
        return passenger.deletePassenger(id);
    }

}
