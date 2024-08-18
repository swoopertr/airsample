package com.project.airsample.controllers.nebiFlight;

import com.project.airsample.nebiAir.personnel.Personnel;
import com.project.airsample.nebiAir.personnel.PersonnelList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nebiAir/personnel")
public class NebiPersonnelController {

    @Autowired
    @Qualifier("nebiPersonnel")
    private Personnel nebiPersonnel;

    @Autowired
    @Qualifier("nebiPersonnelList")
    private PersonnelList nebiPersonnelList;

    //get schema
    @GetMapping({"","/"})
    public Personnel getPersonnel(){
        return nebiPersonnel;
    }


    // Get all personnel
    @GetMapping("/list")
    public PersonnelList getPersonnels() {
        return nebiPersonnelList;
    }



    // Get personnel by ID
    @GetMapping("/{id}")
    public Personnel getPersonnel(@PathVariable int id) {
        return Personnel.getById(id);
    }

    // Save new personnel
    @PostMapping("/")
    public boolean savePersonnel(@RequestBody Personnel newPersonnel) {
        return Personnel.addPersonnel(newPersonnel);
    }

    // Update existing personnel
    @PutMapping("/")
    public boolean updatePersonnel(@RequestBody Personnel updatedPersonnel) {
        return Personnel.updatePersonnel(updatedPersonnel);
    }

    // Delete personnel
    @DeleteMapping("/{id}")
    public boolean deletePersonnel(@PathVariable int id) {
        return Personnel.removePersonnel(id);
    }
}
