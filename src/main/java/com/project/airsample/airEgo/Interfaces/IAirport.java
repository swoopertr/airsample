package com.project.airsample.airEgo.Interfaces;

import com.project.airsample.sinanAir.airport.Airport;

import java.util.List;

public interface IAirport {
    Airport createAirport(Airport airport);
    Airport getAirportByIdEgo(Long id);
    List<Airport> getAllAirportsEgo();
    Airport updateAirport(Long id, Airport airport);
    void deleteAirport(Long id);
}
