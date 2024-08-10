package com.project.airsample.controllers.nebiFlight;

import com.project.airsample.nebilAir.personnel.Personnel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nebiAir/personnel")
public class NebiPersonnelController {

    // Get all personnel
    @GetMapping("/list")
    public List<Personnel> getPersonnelList() {
        return Personnel.getAllPersonnels();
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
