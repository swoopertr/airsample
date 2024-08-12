package com.project.airsample.elifAir.plane;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Component("elifPlanelist")
public class PlaneList {
    private ArrayList<Plane> planes = new ArrayList<Plane>();

    public ArrayList<Plane> getPlanes(){
        //todo : get all planes from db;
        return planes;
    }
}
