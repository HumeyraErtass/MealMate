package com.humeyra.calorietracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodRequestDto {
    private String name;
    private Integer calories;
}
