package com.project.airsample.elifAir.plane;

import com.project.airsample.elifAir.airport.Airport;
import com.project.airsample.elifAir.enums.Manufacturer;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("elifPlane")
public class Plane implements IPlane {

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
    private  int aisleCount;


    public Plane(){}
    // Constructor
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

    // uçağın toplamda kaç saat uçtuğunu takip etmek için. 10.000 saatten sonra bakım gerekir vs. bilgisi lazım olabilir.
    public void addFlightTime(long flighttime) {
        this.totalFlightTime = ++flighttime;
    }

    //DB processes
    public Plane getById(int id){
        //todo: get Plane data from db by id.
        return new Plane();
    }

    public boolean insertDb(Plane plane){
        //todo: insert into db with given Plane parameter
        return true;
    }

    public boolean updateDb(Plane plane){
        //todo : update into db with given Plane parameter.
        return true;
    };


    public Plane deleteDb(int id){
        //todo:delete airport with given airport parameter.
        return new Plane();
    }


//    @Override
//    public int counter() {
//        return 0;
//    }




}
