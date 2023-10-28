package com.AppElearning.controller;

import com.AppElearning.entity.Condidat;
import com.AppElearning.entity.Position;
import com.AppElearning.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/findPosition/{id}")
    public ResponseEntity<Position> findPositionbyCondidat(@PathVariable("id") Long id) {
        Condidat condidat = positionService.findById(id).getCondidat();
        Position position = positionService.findPositionbyCondidat(condidat);
        return new ResponseEntity<>(position, HttpStatus.OK);
    }
}
