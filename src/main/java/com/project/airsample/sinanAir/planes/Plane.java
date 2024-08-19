package com.project.airsample.sinanAir.planes;

import com.project.airsample.sinanAir.interfaces.IPlane;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component("SinanPlane")
public class Plane implements IPlane {


    private int planeId;
    private String model;
    private Date purchaseDate;
    private int businessCapacity;
    private int economyCapacity;

    //CONSTRUCTOR
    public Plane(){

    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public Plane getPlaneById(int planeId) {
        //todo: db plane
        return null;
    }

    @Override
    public List<Plane> getAllPlanes() {
        //todo: db plane
        return List.of();
    }

    @Override
    public boolean addPlane(Plane plane) {
        //todo: db plane
        return false;
    }

    @Override
    public boolean updatePlane(Plane plane) {
        //todo: db plane
        return false;
    }

    @Override
    public boolean deletePlane(int planeId) {
        //todo: db plane
        return false;
    }
}
