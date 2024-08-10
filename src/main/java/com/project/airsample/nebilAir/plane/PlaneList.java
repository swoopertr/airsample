package com.project.airsample.nebilAir.plane;

import com.project.airsample.nebilAir.plane.Plane;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("nebiPlanelist")
public class PlaneList {
    private ArrayList<Plane> planes = new ArrayList<Plane>();

    public ArrayList<Plane> getPlanes(){
        //todo : get all planes from db;
        return planes;
    }
}
