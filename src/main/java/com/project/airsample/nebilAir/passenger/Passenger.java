package com.project.airsample.nebilAir.passenger;

import com.project.airsample.nebilAir.base.Human;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends Human {
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

    // Static methods to manage the passenger list
    public static List<Passenger> getAllPassengers() {
        return passengerList;
    }

    public static Passenger getById(int id) {
        return passengerList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static boolean addPassenger(Passenger newPassenger) {
        return passengerList.add(newPassenger);
    }

    public static boolean updatePassenger(Passenger updatedPassenger) {
        for (int i = 0; i < passengerList.size(); i++) {
            if (passengerList.get(i).getId() == updatedPassenger.getId()) {
                passengerList.set(i, updatedPassenger);
                return true;
            }
        }
        return false;
    }

    public static boolean removePassenger(int id) {
        return passengerList.removeIf(p -> p.getId() == id);
    }

    // Assuming the use of hashCode as a temporary ID
    public int getId() {
        return this.hashCode();
    }
}
