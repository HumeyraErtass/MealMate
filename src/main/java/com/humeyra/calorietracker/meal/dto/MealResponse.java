package main.java.com.humeyra.calorietracker.meal.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class MealResponse {

    private Long id;
    private String name;
    private Integer calories;
    private Double protein;
    private Double carbs;
    private Double fat;
    private LocalDate date;
}
