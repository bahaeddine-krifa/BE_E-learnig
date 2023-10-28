package com.AppElearning.service;

import com.AppElearning.entity.Condidat;
import com.AppElearning.entity.Position;
import com.AppElearning.repository.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
    @Autowired
    private PositionRepo positionRepo;

    public Position findPositionbyCondidat(Condidat condidat){
        return positionRepo.findByCondidat(condidat);
    }

    public Position findById(Long id){
        return positionRepo.findPositionById(id);
    }
}
