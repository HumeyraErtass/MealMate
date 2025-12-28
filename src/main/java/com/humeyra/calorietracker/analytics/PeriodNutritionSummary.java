package main.java.com.humeyra.calorietracker.analytics;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PeriodNutritionSummary {

    private PeriodType periodType;
    private LocalDate startDate;
    private LocalDate endDate;

    private Integer totalCalories;
    private Double averageCalories;

    private Double averageProtein;
    private Double averageCarbs;
    private Double averageFat;
}
