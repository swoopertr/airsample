package com.project.airsample.sinanAir.planes;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("sinanPlane")
public class Plane {
    private String model;
    private Date purchaseDate;
    private int businessCapacity;
    private int economyCapacity;

    //CONSTRUCTOR
    public Plane(){
        this.model = "BOEING";
        this.purchaseDate = new Date(2024,6,6);
        this.businessCapacity = 8;
        this.economyCapacity = 90;
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

    public void insert(Plane plane){
        //todo : insert into db.
        return;
    }

}
