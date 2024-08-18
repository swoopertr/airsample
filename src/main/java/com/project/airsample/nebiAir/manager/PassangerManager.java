package com.project.airsample.nebiAir.manager;

import com.project.airsample.nebiAir.interfaces.IPassenger;
import com.project.airsample.nebiAir.interfaces.IPassengerManager;
import com.project.airsample.nebiAir.passenger.Passenger;

import java.util.List;

public class PassangerManager extends Passenger  implements IPassengerManager, IPassenger {
    @Override
    public List<Passenger> getPassengerGreaterThenThisAge(int age) {
        //todo: get complex data.
        return List.of();
    }

    @Override
    public List<Passenger> getAll() {
        return List.of();
    }
}
