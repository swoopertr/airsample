package com.project.airsample.elifAir.bussines;

import com.project.airsample.elifAir.Passenger;
import com.project.airsample.elifAir.interfaces.IPersonnelBussines;
import com.project.airsample.elifAir.managers.PassengerManager;

import java.util.List;

public class PersonnelBussines extends PassengerManager implements IPersonnelBussines {
    public boolean getPassengerByLogic(int id, String city){
        //todo: apply logic

        return true;
    }

    public boolean getPassengerByLogic1(int id, String city){
        //todo: apply logic
        //todo: get passenger from airport1
        List<Passenger> passengerList= super.getByAirport(id);
        //todo: loop related passengers.
        //todo: update each passengers to airport2.

        return true;
    }

    public boolean getPassengerByLogic2(int id, String city){
        //todo: apply logic

        return true;
    }
}
