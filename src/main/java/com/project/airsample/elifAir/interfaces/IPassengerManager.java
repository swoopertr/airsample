package com.project.airsample.elifAir.interfaces;

import com.project.airsample.elifAir.Passenger;

import java.util.List;

public interface IPassengerManager {
    List<Passenger> getPassengerGreaterThenThisAge(int age);
    List<Passenger> getAll();
}
