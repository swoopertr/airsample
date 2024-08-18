package com.project.airsample.nebiAir.personnel;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("nebiPersonnelList")
public class PersonnelList {
    private ArrayList<Personnel> personnel = new ArrayList<Personnel>();

    public static List<PersonnelList> getAllPersonnels() {
        return new ArrayList<PersonnelList>();
    }

    public ArrayList<Personnel> getPersonnels() {
        //todo : get all Personnels from db;
        return personnel;
    }
}
