package com.humeyra.calorietracker.ai.analysis;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalorieProgressResponse {

    private PeriodType period;
    private int targetCalories;
    private double averageCalories;
    private double deviation;
    private CalorieTrend trend;
    private String aiComment;
}
