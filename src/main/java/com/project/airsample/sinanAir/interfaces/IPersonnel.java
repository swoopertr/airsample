package com.project.airsample.sinanAir.interfaces;



import com.project.airsample.sinanAir.personnel.Personnel;

import java.util.List;

public interface IPersonnel {

    public Personnel getPersonnelById(int humanId);
    public List<Personnel> getAllPersonnel();
    public boolean addPersonnel(Personnel personnel);
    public boolean updatePersonnel(Personnel personnel);
    public boolean deletePersonnel(int humanId);
}
