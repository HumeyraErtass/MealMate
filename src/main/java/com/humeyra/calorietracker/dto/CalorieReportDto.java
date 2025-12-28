package com.humeyra.calorietracker.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CalorieReportDto {

    private Integer totalCalories;
    private Double averageCalories;
    private Integer dayCount;
}
