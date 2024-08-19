package com.project.airsample.controllers.sinanControllers;

import com.project.airsample.sinanAir.interfaces.IPersonnel;
import com.project.airsample.sinanAir.personnel.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinan/personnel")
public class SinanPersonnelController {

    @Autowired
    @Qualifier("SinanPersonnel")
    private IPersonnel personnel;

    @GetMapping({"", "/"})
    public List<Personnel> getAllPersonnel() {
        return personnel.getAllPersonnel();
    }

    @GetMapping("/{id}")
    public Personnel getPersonnelById(@PathVariable int id) {
        return personnel.getPersonnelById(id);
    }

    @PostMapping({"", "/"})
    public boolean addPersonnel(@RequestBody Personnel personnel) {
        return personnel.addPersonnel(personnel);
    }

    @PutMapping({"", "/"})
    public boolean updatePersonnel(@RequestBody Personnel personnel) {
        return personnel.updatePersonnel(personnel);
    }

    @DeleteMapping("/{id}")
    public boolean deletePersonnel(@PathVariable int id) {
        return personnel.deletePersonnel(id);
    }
}
