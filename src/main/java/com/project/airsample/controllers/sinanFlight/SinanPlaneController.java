package com.project.airsample.controllers.sinanFlight;


import com.project.airsample.sinanAir.airport.Airport;
import com.project.airsample.sinanAir.planes.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sinan/plane")
public class SinanPlaneController {

    @Autowired
    @Qualifier("sinanPlane")
    private Plane gokalpPlane;

    @GetMapping({"","/"})
    public Plane getGokalpPlane(){
        return gokalpPlane;
    }

    @PostMapping({"","/"})
    public Plane addPlane(@RequestBody Plane plane) {
        gokalpPlane.insert(plane);
        return plane;
    }

}
