package com.project.airsample.controllers.elifFlight;

import com.project.airsample.elifAir.plane.Plane;
import com.project.airsample.elifAir.plane.PlaneList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
//crud - create - read - update - delete


@RestController
 @RequestMapping("/elifair/plane")
public class ElifPlaneController {
//fonksiyonlar için interface yazmamız gerekiyor. fonksiyonlar oradan 

    @Autowired
    @Qualifier("elifPlane")
    private IPlane elifPlane;

    @Autowired
    @Qualifier("elifPlanelist")
    private IPlaneList elifPlaneList;
    

    @GetMapping("/list")
    public PlaneList getElifPlaneList(){
        return elifPlaneList;
    }

    @GetMapping("{id}")
    public Plane getElifPlanebyId(@RequestParam int id){
        return elifPlane.getById(id);
    }
    @PostMapping("/")
    public boolean savePlane(@RequestBody Plane plane){
        return elifPlane.insertDb(plane);
    }

    @PutMapping("/")
    public boolean updatePlane(@RequestBody Plane plane){
        return elifPlane.updateDb(plane);
    }

    @DeleteMapping ("/{id}")
    public Plane deletePlane(@RequestBody int id){
        return  elifPlane.deleteDb(id);
    }

}
