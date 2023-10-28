package com.AppElearning.controller;

import com.AppElearning.entity.Administrateur;
import com.AppElearning.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
    @Autowired
    private AdminRepo adminRepo;

    @PostMapping("/loginAdmin")
    public ResponseEntity<?> loginAdmin(@RequestBody Administrateur administrateurData) {
        Administrateur administrateur = adminRepo.findByEmail(administrateurData.getEmail());
        if(administrateur.getPassword().equals(administrateurData.getPassword()))
            return ResponseEntity.ok(administrateur);
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }
}
