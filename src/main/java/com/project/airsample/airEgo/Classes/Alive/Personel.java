package com.project.airsample.airEgo.Classes.Alive;

import com.project.airsample.airEgo.Enums.BloodType;
import com.project.airsample.airEgo.Enums.Proffesion;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
public class Personel extends Human {
    private static List<Personel> personnelList = new ArrayList<>();
    private static int idCounter = 0;

    private int id;
    private Proffesion proffesion;


    //Constructer
    public Personel(){
        super();
        this.id = ++idCounter;
        this.setBirtdate(new Date(1997, 04, 24));
        personnelList.add(this);
    };


    public Personel(String name, String surname, Date birthdate, boolean gender, String id,
                     String nationality, int height, int weight, BloodType bloodType, String email, Proffesion Profession){

        super(name, surname, birthdate,gender, id, nationality,  height, weight,  bloodType,  email);
        this.id = ++idCounter;
        personnelList.add(this);
        this.proffesion = Profession;
    }

    // Getter and Setter
    public int getPersonnelId() {
        return id;
    }

    public Proffesion getProffesion(){
        return this.proffesion;
    }

    public void setProffesion(Proffesion proffesion){
        this.proffesion = proffesion;
    }

   public static Personel getPersonelById(int id) {
        for (Personel personel : personnelList) {
            if (personel.getPersonnelId() == id) {
                return personel;
            }
        }
        return null; // ???
    }

    public static List<Personel> getAllPersonnel() {
        return new ArrayList<>(personnelList);
    }

    // Static method to remove a Personel by id
    public static boolean removePersonelById(int id) {
        return personnelList.removeIf(personel -> personel.getPersonnelId() == id);
    }


}
