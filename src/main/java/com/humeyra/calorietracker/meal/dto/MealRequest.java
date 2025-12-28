package main.java.com.humeyra.calorietracker.meal.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MealRequest {

    private String name;
    private Integer calories;
    private Double protein;
    private Double carbs;
    private Double fat;
    private LocalDate date;
}
