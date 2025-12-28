package com.humeyra.calorietracker.report;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class DailyPerformance {

    private LocalDate date;
    private int targetCalories;
    private int consumedCalories;
    private double complianceScore;
}
