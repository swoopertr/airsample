package com.project.airsample.airEgo.Classes.Alive;
import com.project.airsample.airEgo.Interfaces.IPersonel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("egoPersonal")
public class Personel implements IPersonel {
    private Long id;
    private String name;
    private String position;

    private static List<Personel> personelList = new ArrayList<>();

    @Override
    public Personel createPersonel(Personel personel) {
        personelList.add(personel);
        return personel;
    }

    @Override
    public Personel getPersonelById(Long id) {
        return personelList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Personel> getAllPersonel() {
        return personelList;
    }

    @Override
    public Personel updatePersonel(Long id, Personel personel) {
        Personel existingPersonel = getPersonelById(id);
        if (existingPersonel != null) {
            existingPersonel.setName(personel.getName());
            existingPersonel.setPosition(personel.getPosition());
        }
        return existingPersonel;
    }

    @Override
    public void deletePersonel(Long id) {
        personelList.removeIf(p -> p.getId().equals(id));
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

