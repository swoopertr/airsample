package com.project.airsample.controllers;

import com.project.airsample.airEgo.Classes.Alive.Personel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airEgo")
public class EgemenController {

    @Autowired
    private Personel egoAirPersonal;


    private Personel yanciPersonel;

    @Autowired
    public EgemenController(Personel yanci){
        this.yanciPersonel = yanci;
    }

    @GetMapping("/")
    public String Starter(){
        return  "airEgo is active";
    }

    @GetMapping("/personnels")
    public Personel personel(){
         return egoAirPersonal;
    }

    @GetMapping("/yanci")
    public Personel yanciPersonel(){
        return yanciPersonel;
    }

}
