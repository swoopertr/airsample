package com.project.airsample.controllers.nebiFlight;

import com.project.airsample.nebilAir.plane.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nebilAir/plane")
public class NebiPlaneController {

//    @Autowired
//    @Qualifier("nebiPlane")
//    private Plane nebiPlane;
//
//    @Autowired
//    @Qualifier("nebiPlanelist")
//    private Plane nebiPlaneList;
//
//    @GetMapping("/list")
//    public Plane getElifPlaneList(){
//        return nebiPlaneList;
//    }
//
//    @GetMapping("/{id}")
//    public Plane getNebiPlaneById(@PathVariable int id) {
//        return nebiPlane.getById(id);
//    }
//
//    @PostMapping("/")
//    public boolean savePlane(@RequestBody Plane plane) {
//        return nebiPlane.insertDb(plane);
//    }
//
//    @PutMapping("/")
//    public boolean updatePlane(@RequestBody Plane plane) {
//        return nebiPlane.updateDb(plane);
//    }
//
//    @DeleteMapping("/{id}")
//    public boolean deletePlane(@PathVariable int id) {
//        return nebiPlane.deleteDb(id);
//    }
}
