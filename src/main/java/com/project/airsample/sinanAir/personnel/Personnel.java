package com.project.airsample.sinanAir.personnel;

import com.project.airsample.sinanAir.base.Human;
import com.project.airsample.sinanAir.enums.Profession;
import com.project.airsample.sinanAir.interfaces.IPersonnel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("SinanPersonnel")
public class Personnel extends Human implements IPersonnel {
    private Profession profession;

    //constructers

    public Personnel() {

    }

    public  Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public Personnel getPersonnelById(int humanId) {
        //todo: db personnel
        return null;
    }

    @Override
    public List<Personnel> getAllPersonnel() {
        //todo: db personnel
        return List.of();
    }

    @Override
    public boolean addPersonnel(Personnel personnel) {
        //todo: db personnel
        return false;
    }

    @Override
    public boolean updatePersonnel(Personnel personnel) {
        //todo: db personnel
        return false;
    }

    @Override
    public boolean deletePersonnel(int humanId) {
        //todo: db personnel
        return false;
    }
}
