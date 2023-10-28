package com.AppElearning.repository;

import com.AppElearning.entity.Condidat;
import com.AppElearning.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PositionRepo extends JpaRepository<Position,Long> {

    Position findPositionById(Long aLong);

    Position findByCondidat(Condidat condidat);
}
