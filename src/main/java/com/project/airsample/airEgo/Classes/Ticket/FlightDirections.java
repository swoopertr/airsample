package com.project.airsample.airEgo.Classes.Ticket;

import com.project.airsample.airEgo.Interfaces.IFlightDirections;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightDirections implements IFlightDirections {

    private static List<FlightDirections> flightDirectionsList = new ArrayList<>();
    private static int idCounter = 0;

    //@Autowire
    //private IFlightDirectionsManager flightDirectionsManager;
    private Airport arrival;
    private Airport departure;
    private boolean internal;
    private int id;

    // Constrcters
     public  FlightDirections(){
         this.id = ++idCounter;
         arrival  = new Airport();
         departure = new Airport();
    };

    public FlightDirections(Airport arrival, Airport departure, boolean internal) {
        this.id = ++idCounter;
        this.arrival = arrival;
        this.departure = departure;
        this.internal = internal;
    }

    // CRUD Operations

    // Create (Add) a new FlightDirection
    public boolean addFlightDirection(FlightDirections flightDirection) {
        idCounter++;
        flightDirectionsManager.add(flightDirection);

        return true;
    }

    public List<FlightDirections> getFlightDirections(){
        //todo: get  flight directions from db
        return flightDirectionsList;
    }



    public FlightDirections getFlightDirectionById(int id) {
        //todo: get flight direction from db by id
            return flightDirectionsManager.get(id);
    }


    // Update a FlightDirection by ID
    public boolean updateFlightDirection(FlightDirections updatedFlightDirection) {
        //todo : udpdate the record in db.

        flightDirectionsManager.set(updatedFlightDirection.getFlightDirectionId(), updatedFlightDirection);

        return true;
    }


    // Delete a FlightDirection by ID
    public boolean deleteFlightDirection(int id) {
        //todo: delete from db

            flightDirectionsManager.remove(id);

        return true;
    }

    //Getters and setter

    public int getAirPortCodeArrival() {
        return arrival.getCode();
    }

    public int getAirPortCodeDeparture() {

        return departure.getCode();
    }

    public int getFlightDirectionId(){
        return this.id;
    }

    public void setFlightDirectionId(int _id){
        this.id = _id;
    }

    public boolean getInternal(){
        return this.internal;
    }

    public String DirectionInfo(){

        return departure.getName() + "'dan " + arrival.getName() + " havalimanına  gitmektedir.";
    }

}
