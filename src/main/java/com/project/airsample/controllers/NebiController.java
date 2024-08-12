package com.project.airsample.controllers;

import com.project.airsample.elifAir.IAdvantageProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/nebiAir")
public class NebiController {

    @GetMapping("/")
    public String Starter(){
        return  "nebi controller";
    }





}
