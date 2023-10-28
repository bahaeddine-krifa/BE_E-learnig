package com.AppElearning.controller;

import com.AppElearning.entity.Condidat;
import com.AppElearning.repository.CondidatRepo;
import com.AppElearning.service.CondiatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CondidatController {
    @Autowired
    private CondidatRepo condidatRepo;
    @Autowired
    private CondiatService condiatService;

    @PostMapping("/loginCondidat")
    public ResponseEntity<?> loginCondidat(@RequestBody Condidat condidatData) {
        Condidat condidat = condidatRepo.findByEmail(condidatData.getEmail());
        if(condidat.getPassword().equals(condidatData.getPassword()))
            return ResponseEntity.ok(condidat);
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }

    @GetMapping("/allCondidat")
    public ResponseEntity<List<Condidat>> getAllCondidat() {
        List<Condidat> condidats =condiatService.findAllCondidat();
        return new ResponseEntity<>(condidats, HttpStatus.OK);
    }

    @GetMapping("/findCondidat/{id}")
    public ResponseEntity<Condidat> getCondidatById(@PathVariable("id") Long id) {
        Condidat condidat = condiatService.findCondidatById(id);
        return new ResponseEntity<>(condidat, HttpStatus.OK);
    }

    @PostMapping("/addCondidat")
    public ResponseEntity<Condidat> addCondidat(@RequestBody Condidat condidat) {
        Condidat condidat1 = condiatService.addCondidat(condidat);
        return new ResponseEntity<>(condidat1, HttpStatus.CREATED);
    }

    @PutMapping("/updateCondidat")
    public ResponseEntity<Condidat> updateCondidat(@RequestBody Condidat condidat) {
        Condidat condidat1 = condiatService.updateCondidat(condidat);
        return new ResponseEntity<>(condidat1, HttpStatus.CREATED);
    }


    @DeleteMapping("/deleteCondidat/{id}")
    public ResponseEntity<?> deleteCondidat(@PathVariable("id") Long id) {
        condiatService.deleteCondidat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
