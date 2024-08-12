package com.project.airsample.elifAir;

import java.util.List;

public interface IPassenger {
    Passenger getById(int id);
    List<Passenger> getAll();
    boolean insertPassenger(Passenger passenger);
    boolean updatePassenger(Passenger passenger);
    boolean deletePassenger(int id);
}
