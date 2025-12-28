package com.humeyra.calorietracker.ai.adaptation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeeklyCalorieAdjustmentResponse {

    private double previousTarget;
    private double newTarget;
    private String aiFeedback;
}
