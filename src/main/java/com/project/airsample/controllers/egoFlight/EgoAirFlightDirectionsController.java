package com.project.airsample.controllers.egoFlight;

import com.project.airsample.airEgo.Classes.Ticket.FlightDirections;
import com.project.airsample.airEgo.Interfaces.IFlightDirections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airego/flightdirections")
public class EgoAirFlightDirectionsController {

    //crud - create - read - update - delete

    //@Autowired
    private IFlightDirections flightDirectionsService;

    @Autowired
    public EgoAirFlightDirectionsController(@Qualifier("vipFlightDirection") IFlightDirections flightDirectionsService) {
        this.flightDirectionsService = flightDirectionsService;
    }

    //GET
    @GetMapping({ "" , "/" })
    public List<FlightDirections> getFlights() {
        return flightDirectionsService.getFlightDirections();
    }

    @GetMapping("/{id}")
    public FlightDirections getFlightsById(@PathVariable("id") int id) {
        return flightDirectionsService.getFlightDirectionById(id);
    }

    // POST
    @PostMapping("/")
    public String addFlight(@RequestBody FlightDirections newFlightDirection) {
        boolean insertResult = flightDirectionsService.addFlightDirection(newFlightDirection);

        return "Flight direction added.";
    }

    // PUT
    @PutMapping("/")
    public String updateFlight(@RequestBody FlightDirections updatedFlightDirection) {

        boolean updateResult = flightDirectionsService.updateFlightDirection(updatedFlightDirection);
        return "Flight direction updated.";
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String deleteFlight(@PathVariable("id") int id) {
        flightDirectionsService.deleteFlightDirection(id);
        return "Flight direction deleted.";
    }

    public List<String> getPassengerListbyflightNumber(int flightNumber){
        try {
            List<String> passengerList = flightDirectionsService.getFlightDirectionById(flightNumber).GetfligthInfo().getPassengers();
        }catch (Exception ex){

        }


    }

}
