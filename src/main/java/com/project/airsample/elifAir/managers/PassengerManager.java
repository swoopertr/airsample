package com.project.airsample.elifAir.managers;

import com.project.airsample.elifAir.IPassenger;
import com.project.airsample.elifAir.Passenger;
import com.project.airsample.elifAir.interfaces.IPassengerManager;

import java.util.List;

public class PassengerManager extends Passenger implements IPassengerManager, IPassenger {

    @Override
    public List<Passenger> getPassengerGreaterThenThisAge(int age) {
        //todo: get complex data.
        return List.of();
    }

    public List<Passenger> getByAirport(int airportId){
        return List.of();
    }

    @Override
    public List<Passenger> getAll() {
        //todo : count the query.
        return super.getAll();
    }
}
