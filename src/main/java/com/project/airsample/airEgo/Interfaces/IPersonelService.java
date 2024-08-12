package com.project.airsample.airEgo.Interfaces;

import com.project.airsample.airEgo.Classes.Alive.Personel;

import java.util.List;

public interface IPersonelService {
    List<Personel> getAllPersonnel();
    Personel getPersonelById(int id);
    Personel createPersonel(Personel newPersonel);
    Personel updatePersonel(int id, Personel updatedPersonel);
    boolean deletePersonel(int id);
}
