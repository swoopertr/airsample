package com.project.airsample.airEgo.Classes.Alive;

import com.project.airsample.airEgo.Enums.BloodType;
import com.project.airsample.airEgo.Enums.Proffesion;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Personel extends Human {
    private Proffesion proffesion;


    //Constructer
    public Personel(){
        super();
        this.setBirtdate(new Date(1997, 04, 24));
    };


    public Personel(String name, String surname, Date birthdate, boolean gender, String id,
                     String nationality, int height, int weight, BloodType bloodType, String email, Proffesion Profession){

        super(name, surname, birthdate,gender, id, nationality,  height, weight,  bloodType,  email);
        this.proffesion = Profession;
    }

    // Getter and Setter

    public Proffesion getProffesion(){
        return this.proffesion;
    }

    public void setProffesion(Proffesion proffesion){
        this.proffesion = proffesion;
    }

}
