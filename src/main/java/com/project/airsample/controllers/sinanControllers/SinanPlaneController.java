package com.project.airsample.controllers.sinanControllers;

import com.project.airsample.sinanAir.airport.Airport;
import com.project.airsample.sinanAir.interfaces.IPlane;
import com.project.airsample.sinanAir.planes.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinan/plane")
public class SinanPlaneController {

    @Autowired
    @Qualifier("SinanPlane")
    private IPlane plane;

    @GetMapping({"", "/"})
    public List<Plane> getAllPlanes() {
        return plane.getAllPlanes();
    }

    @GetMapping("/{id}")
    public Plane getPlaneById(@PathVariable int id) {
        return plane.getPlaneById(id);
    }

    @PostMapping({"", "/"})
    public boolean addPlane(@RequestBody Plane plane) {
        return plane.addPlane(plane);
    }

    @PutMapping({"", "/"})
    public boolean updatePlane(@RequestBody Plane plane) {
        return plane.updatePlane(plane);
    }

    @DeleteMapping("/{id}")
    public boolean deletePlane(@PathVariable int id) {
        return plane.deletePlane(id);
    }
}
