package com.humeyra.calorietracker.repository;

import com.humeyra.calorietracker.entity.DailyLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DailyLogRepository extends JpaRepository<DailyLog, Long> {

    List<DailyLog> findByUserIdAndDate(Long userId, LocalDate date);
}
