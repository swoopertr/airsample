package com.project.airsample.nebiAir.interfaces;

import com.project.airsample.nebiAir.passenger.Passenger;

import java.util.List;

public interface IPassengerManager {
    List<Passenger> getPassengerGreaterThenThisAge(int age);
    List<Passenger> getAll();
}
