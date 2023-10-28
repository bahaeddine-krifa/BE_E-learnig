package com.AppElearning.service;

import com.AppElearning.entity.Chapitre;
import com.AppElearning.exception.CondidatException;
import com.AppElearning.repository.ChapitreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapitreService {
    @Autowired
    private ChapitreRepo chapitreRepo;

    public List<Chapitre> findAllChapitre() {
        return chapitreRepo.findAll();
    }

    public Chapitre addChapitre(Chapitre chapitre) {
        return chapitreRepo.save(chapitre);
    }

    public Chapitre findChapitreById(Long id) {
        return chapitreRepo.findChapitreById(id)
                .orElseThrow(() -> new CondidatException("Chapitre by id "+id+ " was not found"));
    }

    public Chapitre updateChapitre(Chapitre chapitre) {
        return chapitreRepo.save(chapitre);
    }

    public void deleteChapitre(Long id){
        chapitreRepo.deleteById(id);
    }
}
