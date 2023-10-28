package com.AppElearning.service;

import com.AppElearning.entity.Objectif;
import com.AppElearning.exception.ObjectifException;
import com.AppElearning.repository.ObjectifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectifService {
    @Autowired
    private ObjectifRepo objectifRepo;

    public List<Objectif> findObjectifs(Long id) {
        List<Objectif> objectifs = objectifRepo.findAll();
        List<Objectif> objectifs1 = new ArrayList<>();
        for(int i=0;i<objectifs.size();i++) {
            if(objectifs.get(i).getChapitre().getId()== id){
                objectifs1.add(objectifs.get(i));
            }
        }
        return objectifs1;
    }
    public Objectif findObjectifById(Long id) {
        return objectifRepo.findObjectifById(id)
                .orElseThrow(() -> new ObjectifException("Objectif by id"+ id+ "was not found"));
    }
    public Objectif addObjectif(Objectif objectif) {
        return objectifRepo.save(objectif);
    }

    public Objectif updateObjectif(Objectif objectif){
        return objectifRepo.save(objectif);
    }

    public void deleteObjectif(Long id){
        objectifRepo.deleteById(id);
    }
}
