package com.humeyra.calorietracker.ai.personalization;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonalizedCalorieResponse {

    private double bmr;
    private double tdee;
    private int recommendedCalories;
    private String aiExplanation;
}
