package com.AppElearning.controller;

import com.AppElearning.entity.Instruction;
import com.AppElearning.entity.Objectif;
import com.AppElearning.service.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InstructionController {
    @Autowired
    private InstructionService instructionService;

    @GetMapping("/instructions/{id}")
    public ResponseEntity<List<Instruction>> getInstructions(@PathVariable("id") Long id) {
        List<Instruction> instructions = instructionService.findInstruction(id);
        return new ResponseEntity<>(instructions, HttpStatus.OK);
    }
}
