package com.AppElearning.service;

import com.AppElearning.entity.Instruction;
import com.AppElearning.exception.InstructionException;
import com.AppElearning.repository.InstructionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructionService {
    @Autowired
    private InstructionRepo instructionRepo;

    public List<Instruction> findInstruction(Long id){
        List<Instruction> instructions = instructionRepo.findAll();
        List<Instruction> instructions1 = new ArrayList<>();
        for(int i=0;i<instructions.size();i++) {
            if(instructions.get(i).getObjectif().getId()== id) {
                instructions1.add(instructions.get(i));
            }
        }
        return instructions1;
    }

    public Instruction findInstructionById(Long id){
        return instructionRepo.findInstructionById(id)
                .orElseThrow(() -> new InstructionException("Instruction by id" + id+ "was not found"));
    }
}
