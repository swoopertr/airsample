package com.project.airsample.controllers.sinanControllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sinan")
public class SinanController {

    @GetMapping({"","/"})
    public String Starter(){
        return  "SinanAir is active";
    }

}
