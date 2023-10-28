package com.AppElearning.controller;

import com.AppElearning.entity.Objectif;
import com.AppElearning.service.ObjectifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ObjectifController {
    @Autowired
    private ObjectifService objectifService;

    @GetMapping("/objectifs/{id}")
    public ResponseEntity<List<Objectif>> getObjectifs(@PathVariable("id") Long id) {
        List<Objectif> objectifs = objectifService.findObjectifs(id);
        return new ResponseEntity<>(objectifs, HttpStatus.OK);
    }
    @PostMapping("/addObjectif")
    public ResponseEntity<Objectif> addObjectif(@RequestBody Objectif objectif) {
        Objectif objectif1= objectifService.addObjectif(objectif);
        return new ResponseEntity<>(objectif1,HttpStatus.CREATED);
    }
    @PutMapping("/updateObjectif")
    public ResponseEntity<Objectif> updateObjectif(@RequestBody Objectif objectif) {
        Objectif objectif1 = objectifService.updateObjectif(objectif);
        return new ResponseEntity<>(objectif1,HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteObjectif/{id}")
    public ResponseEntity<?> deleteObjectif(@PathVariable("id") Long id) {
        objectifService.deleteObjectif(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
