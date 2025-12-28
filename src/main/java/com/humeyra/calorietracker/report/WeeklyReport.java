package com.humeyra.calorietracker.report;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class WeeklyReport {

    private List<DailyPerformance> dailyPerformances;
    private double averageCompliance;
    private String weeklyStatus;
}
