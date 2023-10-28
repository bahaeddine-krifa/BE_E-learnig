package com.AppElearning.service;

import com.AppElearning.entity.Condidat;
import com.AppElearning.exception.CondidatException;
import com.AppElearning.repository.CondidatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondiatService {
    @Autowired
    private CondidatRepo condidatRepo;

    public List<Condidat> findAllCondidat() {
        return condidatRepo.findAll();
    }

    public Condidat addCondidat(Condidat condidat) {
        return condidatRepo.save(condidat);
    }

    public Condidat findCondidatById(Long id) {
        return condidatRepo.findCondidatById(id)
                .orElseThrow(() -> new CondidatException("Condidat by id "+ id +" was not found" ));
    }

    public Condidat updateCondidat(Condidat condidat) {
        return condidatRepo.save(condidat);
    }

    public void deleteCondidat(Long id) {
        condidatRepo.deleteById(id);
    }
}
