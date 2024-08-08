package com.project.airsample.sinanAir.flight;

import com.project.airsample.sinanAir.airport.Airport;

public class Flight {
    private String flightNumber;
    private Airport origin;
    private Airport destination;

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDestination() {
        return destination;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }
}
