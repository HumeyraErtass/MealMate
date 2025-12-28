package com.humeyra.calorietracker.repository;

import com.humeyra.calorietracker.entity.DailyCalorie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface DailyCalorieRepository extends JpaRepository<DailyCalorie, Long> {

    List<DailyCalorie> findByUserIdAndDateBetween(
            Long userId,
            LocalDate startDate,
            LocalDate endDate
    );
}
