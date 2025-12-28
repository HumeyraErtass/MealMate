package main.java.com.humeyra.calorietracker.ai;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalorieTargetResponse {

    private double bmr;
    private double tdee;
    private int targetCalories;
    private String recommendation;
}
