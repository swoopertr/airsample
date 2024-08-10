package com.project.airsample.nebilAir.plane;

import com.project.airsample.elifAir.enums.Manufacturer;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("nebiPlane")
public class Plane  {

    private String model;
    private Manufacturer manufacturer;
    private Date purchaseDate;
    private int businessCapacity;
    private int economyCapacity;
    private int firstClassCapacity;
    private int premiumEconomyCapacity;
    private int doorCount;
    private int emergencyExitCount;
    private long totalFlightTime;
    private int aisleCount;

    public Plane() {
        this.totalFlightTime = 0;
    }

    public Plane(String model, Manufacturer manufacturer, Date purchaseDate, int businessCapacity,
                 int economyCapacity, int firstClassCapacity, int premiumEconomyCapacity,
                 int doorCount, int emergencyExitCount, int aisleCount) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.purchaseDate = purchaseDate;
        this.businessCapacity = businessCapacity;
        this.economyCapacity = economyCapacity;
        this.firstClassCapacity = firstClassCapacity;
        this.premiumEconomyCapacity = premiumEconomyCapacity;
        this.doorCount = doorCount;
        this.emergencyExitCount = emergencyExitCount;
        this.aisleCount = aisleCount;
        this.totalFlightTime = 0;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getBusinessCapacity() {
        return businessCapacity;
    }

    public void setBusinessCapacity(int businessCapacity) {
        this.businessCapacity = businessCapacity;
    }

    public int getEconomyCapacity() {
        return economyCapacity;
    }

    public void setEconomyCapacity(int economyCapacity) {
        this.economyCapacity = economyCapacity;
    }

    public int getFirstClassCapacity() {
        return firstClassCapacity;
    }

    public void setFirstClassCapacity(int firstClassCapacity) {
        this.firstClassCapacity = firstClassCapacity;
    }

    public int getPremiumEconomyCapacity() {
        return premiumEconomyCapacity;
    }

    public void setPremiumEconomyCapacity(int premiumEconomyCapacity) {
        this.premiumEconomyCapacity = premiumEconomyCapacity;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getEmergencyExitCount() {
        return emergencyExitCount;
    }

    public void setEmergencyExitCount(int emergencyExitCount) {
        this.emergencyExitCount = emergencyExitCount;
    }

    public long getTotalFlightTime() {
        return totalFlightTime;
    }

    public void setTotalFlightTime(long totalFlightTime) {
        this.totalFlightTime = totalFlightTime;
    }

    public int getAisleCount() {
        return aisleCount;
    }

    public void setAisleCount(int aisleCount) {
        this.aisleCount = aisleCount;
    }

    // Method to add flight time
    public void addFlightTime(long flightTime) {
        this.totalFlightTime += flightTime;
    }

    // DB processes

    public String deneme() {
        // TODO: Implement logic to get data from DB
        return "Database details"; // Example return
    }

    public Plane getById(int id) {
        // TODO: Get Plane data from DB by ID.
        return new Plane();
    }

    public boolean insertDb(Plane plane) {
        // TODO: Insert into DB with given Plane parameter.
        return true;
    }

    public boolean updateDb(Plane plane) {
        // TODO: Update into DB with given Plane parameter.
        return true;
    }

    public boolean deleteDb(int id) {
        // TODO: Delete Plane by ID.
        return true;
    }
}
