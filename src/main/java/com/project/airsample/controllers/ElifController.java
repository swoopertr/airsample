package com.project.airsample.controllers;


import com.project.airsample.elifAir.IAdvantageProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/<companyName>")
@RestController
@RequestMapping("/elifAir")
public class ElifController {

    @GetMapping("/")
    public String Starter(){
        return  "elif controller";
    }


    @Autowired
    @Qualifier("elifHuman")
    private IAdvantageProgram object;

    @GetMapping("/program")
    public IAdvantageProgram Program(){
        this.object.counter();

        return this.object;
    }



}
