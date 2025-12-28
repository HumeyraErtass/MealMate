package com.humeyra.calorietracker.ai;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NutritionAdvice {

    private String title;
    private String description;
    private String severity;
}
