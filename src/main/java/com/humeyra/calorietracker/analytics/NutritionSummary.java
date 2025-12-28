package main.java.com.humeyra.calorietracker.analytics;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class NutritionSummary {

    private LocalDate date;
    private Integer totalCalories;
    private Double totalProtein;
    private Double totalCarbs;
    private Double totalFat;
}
