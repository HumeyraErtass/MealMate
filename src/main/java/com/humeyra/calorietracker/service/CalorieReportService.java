package com.humeyra.calorietracker.service;

import com.humeyra.calorietracker.dto.CalorieReportDto;
import com.humeyra.calorietracker.entity.DailyCalorie;
import com.humeyra.calorietracker.repository.DailyCalorieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CalorieReportService {

    private final DailyCalorieRepository repository;

    public CalorieReportDto getReport(Long userId, LocalDate start, LocalDate end) {

        List<DailyCalorie> records =
                repository.findByUserIdAndDateBetween(userId, start, end);

        int total = records.stream()
                .mapToInt(DailyCalorie::getConsumedCalories)
                .sum();

        int days = records.size();

        double average = days == 0 ? 0 : (double) total / days;

        return CalorieReportDto.builder()
                .totalCalories(total)
                .averageCalories(average)
                .dayCount(days)
                .build();
    }
}
