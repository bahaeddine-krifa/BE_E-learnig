package com.AppElearning.repository;

import com.AppElearning.entity.Chapitre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChapitreRepo extends JpaRepository<Chapitre,Long> {

    Optional<Chapitre> findChapitreById(Long id);
}
