package com.project.airsample.nebiAir.plane;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("nebiPlaneList")
public class PlaneList {
    private ArrayList<Plane> planes = new ArrayList<Plane>();

    public ArrayList<Plane> getPlanes(){
        //todo : get all planes from db;
        return planes;
    }
}
