package com.AppElearning.repository;

import com.AppElearning.entity.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface InstructionRepo extends JpaRepository<Instruction,Long> {

    Optional<Instruction> findInstructionById(Long id);
}
