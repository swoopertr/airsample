package com.project.airsample.airEgo.Classes.Ticket;

import com.project.airsample.airEgo.Interfaces.IFlightDirections;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("vipFlightDirection")
public class VipFlightDirection implements IFlightDirections {
    @Override
    public List<FlightDirections> getFlightDirections() {
        return List.of();
    }

    @Override
    public FlightDirections getFlightDirectionById(int id) {
        return null;
    }

    @Override
    public boolean addFlightDirection(FlightDirections newFlightDirection) {
        return false;
    }

    @Override
    public boolean updateFlightDirection(FlightDirections updatedFlightDirection) {
        return false;
    }

    @Override
    public boolean deleteFlightDirection(int id) {
        return false;
    }
}
