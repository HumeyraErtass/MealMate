package com.humeyra.calorietracker.ai.nutrition;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NutritionRecommendationResponse {

    private int dailyCalories;
    private MacroDistribution macros;
    private List<DailyMenuItem> menu;
    private String aiComment;
}
