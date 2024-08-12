package com.project.airsample.airEgo.Interfaces;

import com.project.airsample.airEgo.Classes.Ticket.FlightDirections;

import java.util.List;

public interface IFlightDirections {
    List<FlightDirections> getFlightDirections();
    FlightDirections getFlightDirectionById(int id);
    boolean addFlightDirection(FlightDirections newFlightDirection);
    boolean updateFlightDirection(FlightDirections updatedFlightDirection);
    boolean deleteFlightDirection(int id);
}
