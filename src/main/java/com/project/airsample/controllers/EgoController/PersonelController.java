package com.project.airsample.controllers.EgoController;

import com.project.airsample.airEgo.Classes.Alive.Personel;
import com.project.airsample.airEgo.Interfaces.IPersonel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personel")
public class PersonelController {

    private final IPersonel personelService;

    @Autowired
    public PersonelController(IPersonel personelService) {
        this.personelService = personelService;
    }

    @PostMapping("/create")
    public Personel createPersonel(@RequestBody Personel personel) {
        return personelService.createPersonel(personel);
    }

    @GetMapping("/{id}")
    public Personel getPersonelById(@PathVariable Long id) {
        return personelService.getPersonelById(id);
    }

    @GetMapping("/all")
    public List<Personel> getAllPersonel() {
        return personelService.getAllPersonel();
    }

    @PutMapping("/update/{id}")
    public Personel updatePersonel(@PathVariable Long id, @RequestBody Personel personel) {
        return personelService.updatePersonel(id, personel);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePersonel(@PathVariable Long id) {
        personelService.deletePersonel(id);
    }
}
