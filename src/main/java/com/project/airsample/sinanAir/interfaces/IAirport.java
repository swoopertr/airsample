package com.project.airsample.sinanAir.interfaces;

import com.project.airsample.sinanAir.airport.Airport;

import java.util.List;

public interface IAirport {

    public Airport getAirportByCode(int code);
    public List<Airport> getAllAirports();
    public boolean addAirport(Airport airport);
    public boolean updateAirport(Airport airport);
    public boolean deleteAirport(int code);


}
