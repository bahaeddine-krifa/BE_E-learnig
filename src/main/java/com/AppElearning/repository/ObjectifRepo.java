package com.AppElearning.repository;

import com.AppElearning.entity.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ObjectifRepo extends JpaRepository<Objectif,Long> {

    Optional<Objectif> findObjectifById(Long id);
}
