package com.project.airsample.airEgo.Classes.Ticket;

import com.project.airsample.airEgo.Interfaces.IAirport;

import java.util.ArrayList;
import java.util.List;

public class Airport implements IAirport {
    private Long id;
    private String name;
    private String code;

    private static List<Airport> airportList = new ArrayList<>();


    public Airport createAirport(Airport airport) {
        airportList.add(airport);
        return airport;
    }

    @Override
    public com.project.airsample.sinanAir.airport.Airport createAirport(com.project.airsample.sinanAir.airport.Airport airport) {
        return null;
    }

    @Override
    public com.project.airsample.sinanAir.airport.Airport getAirportByIdEgo(Long id) {
        return null;
    }

    @Override
    public List<com.project.airsample.sinanAir.airport.Airport> getAllAirportsEgo() {
        return List.of();
    }


    public Airport getAirportById(Long id) {
        return airportList.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    public List<Airport> getAllAirports() {
        return airportList;
    }

    @Override
    public com.project.airsample.sinanAir.airport.Airport updateAirport(Long id, com.project.airsample.sinanAir.airport.Airport airport) {
        return null;
    }


    public Airport updateAirport(Long id, Airport airport) {
        Airport existingAirport = getAirportById(id);
        if (existingAirport != null) {
            existingAirport.setName(airport.getName());
            existingAirport.setCode(airport.getCode());
        }
        return existingAirport;
    }

    @Override
    public void deleteAirport(Long id) {
        airportList.removeIf(a -> a.getId().equals(id));
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
