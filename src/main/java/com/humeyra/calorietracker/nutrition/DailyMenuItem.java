package com.humeyra.calorietracker.ai.nutrition;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DailyMenuItem {

    private String meal;
    private String description;
    private int calories;
}
