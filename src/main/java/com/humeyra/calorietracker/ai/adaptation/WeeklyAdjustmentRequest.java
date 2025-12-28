package com.humeyra.calorietracker.ai.adaptation;

import lombok.Data;
import java.util.List;

@Data
public class WeeklyAdjustmentRequest {

    private double currentCalorieTarget;
    private List<WeeklyWeightEntry> lastTwoWeeks;
}
