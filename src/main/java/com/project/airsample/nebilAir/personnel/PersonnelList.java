package com.project.airsample.nebilAir.personnel;

import com.project.airsample.nebilAir.personnel.Personnel;

import java.util.ArrayList;

public class PersonnelList {
    private ArrayList<Personnel> personnel = new ArrayList<Personnel>();

    public ArrayList<Personnel> getPersonnels() {
        //todo : get all Personnels from db;
        return personnel;
    }
}
