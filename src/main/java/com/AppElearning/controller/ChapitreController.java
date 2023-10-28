package com.AppElearning.controller;

import com.AppElearning.entity.Chapitre;
import com.AppElearning.entity.Condidat;
import com.AppElearning.service.ChapitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ChapitreController {
    @Autowired
    private ChapitreService chapitreService;

    @GetMapping("/allChapitre")
    public ResponseEntity<List<Chapitre>> getAllChapitre() {
        List<Chapitre> chapitres =chapitreService.findAllChapitre();
        return new ResponseEntity<>(chapitres, HttpStatus.OK);
    }

    @GetMapping("/findChapitre/{id}")
    public ResponseEntity<Chapitre> getChapitreById(@PathVariable("id") Long id) {
        Chapitre chapitre = chapitreService.findChapitreById(id);
        return new ResponseEntity<>(chapitre, HttpStatus.OK);
    }

    @PostMapping("/addChapitre")
    public ResponseEntity<Chapitre> addChapitre(@RequestBody Chapitre chapitre) {
        Chapitre chapitre1 = chapitreService.addChapitre(chapitre);
        return new ResponseEntity<>(chapitre1, HttpStatus.CREATED);
    }

    @PutMapping("/updateChapitre")
    public ResponseEntity<Chapitre> updateChapitre(@RequestBody Chapitre chapitre) {
        Chapitre chapitre1 = chapitreService.updateChapitre(chapitre);
        return new ResponseEntity<>(chapitre1, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteChapitre/{id}")
    public ResponseEntity<?> deleteChapitre(@PathVariable("id") Long id) {
        chapitreService.deleteChapitre(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
