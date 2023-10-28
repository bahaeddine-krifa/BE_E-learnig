package com.AppElearning.repository;

import com.AppElearning.entity.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Administrateur,Long> {

    Administrateur findByEmail(String email);
}
