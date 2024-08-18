package com.project.airsample.controllers.nebiFlight;

import com.project.airsample.nebiAir.plane.Plane;
import com.project.airsample.nebiAir.plane.PlaneList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nebiAir/plane")
public class NebiPlaneController {

    @Autowired
    @Qualifier("nebiPlane")
    private Plane nebiPlane;

    @Autowired
    @Qualifier("nebiPlaneList")
    private PlaneList nebiPlaneList;

    //get Plane Schema
    @GetMapping({"", "/"})
    public Plane getNebiPlane(){
        return nebiPlane;
    }

    @GetMapping("/list")
    public PlaneList getNebiPlaneList(){
        return nebiPlaneList;
    }

    @GetMapping("/{id}")
    public Plane getNebiPlaneById(@PathVariable int id) {
        return nebiPlane.getById(id);
    }

    @PostMapping("/")
    public boolean savePlane(@RequestBody Plane plane) {
        return nebiPlane.insertDb(plane);
    }

    @PutMapping("/")
    public boolean updatePlane(@RequestBody Plane plane) {
        return nebiPlane.updateDb(plane);
    }

    @DeleteMapping("/{id}")
    public boolean deletePlane(@PathVariable int id) {
        return nebiPlane.deleteDb(id);
    }
}
