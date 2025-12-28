package com.humeyra.calorietracker.ai.tracking;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DailyCalorieSummaryResponse {

    private int targetCalories;
    private int consumedCalories;
    private int difference;
    private DailyCalorieStatus status;
    private String aiFeedback;
}
