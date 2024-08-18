package com.project.airsample.nebiAir.passenger;

import com.project.airsample.nebiAir.base.Human;
import com.project.airsample.nebiAir.interfaces.IPassenger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("nebiPassenger")
public class Passenger extends Human  implements IPassenger {
    private String passportNumber;
    private String ticketNumber;
    private static List<Passenger> passengerList = new ArrayList<>();

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public Passenger getById(int id) {
        //todo: get data from db by id.
        return new Passenger();
    }

    @Override
    public List<Passenger> getAllPassengers() {
        //todo: get data from db by id.
        return List.of();
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        //todo: insert data db  by passenger.
        return true;
    }

    @Override
    public boolean updatePassenger(Passenger passenger) {
        //todo: update data  into db.
        return true;
    }

    @Override
    public boolean removePassenger(int id) {
        //todo: delete  data by id.
        return true;
    }

    // Static methods to manage the passenger list
//    public static List<Passenger> getAllPassengers() {
//        return passengerList;
//    }

//    public static Passenger getById(int id) {
//        return passengerList.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    public static boolean addPassenger(Passenger newPassenger) {
//        return passengerList.add(newPassenger);
//    }
//
//    public static boolean updatePassenger(Passenger updatedPassenger) {
//        for (int i = 0; i < passengerList.size(); i++) {
//            if (passengerList.get(i).getId() == updatedPassenger.getId()) {
//                passengerList.set(i, updatedPassenger);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean removePassenger(int id) {
//        return passengerList.removeIf(p -> p.getId() == id);
//    }
//
//    // Assuming the use of hashCode as a temporary ID
//    public int getId() {
//        return this.hashCode();
//    }
}
