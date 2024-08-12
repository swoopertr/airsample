package com.project.airsample.airEgo.Interfaces;
import com.project.airsample.airEgo.Classes.Alive.Personel;

import java.util.List;

public interface IPersonel {
    Personel createPersonel(Personel personel);
    Personel getPersonelById(Long id);
    List<Personel> getAllPersonel();
    Personel updatePersonel(Long id, Personel personel);
    void deletePersonel(Long id);
}
