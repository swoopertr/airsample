package com.project.airsample.nebiAir.interfaces;

import com.project.airsample.nebiAir.passenger.Passenger;
//import com.example.demo.nebiAir.passenger.PassengerList;

import java.util.List;

public interface IPassenger {

    Passenger getById(int id);
    List<Passenger> getAllPassengers();
    boolean addPassenger(Passenger passenger);
    boolean updatePassenger(Passenger passenger);
    boolean removePassenger(int id);

}
