package com.project.airsample.sinanAir.planes;

import java.util.Date;

public class Plane {
    private String model;
    private Date purchaseDate;
    private int businessCapacity;
    private int economyCapacity;

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
}
