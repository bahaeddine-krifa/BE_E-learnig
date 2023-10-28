package com.AppElearning.repository;

import com.AppElearning.entity.Condidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CondidatRepo extends JpaRepository<Condidat,Long> {
    Condidat findByEmail(String email);

    Optional<Condidat> findCondidatById(Long id);
}
