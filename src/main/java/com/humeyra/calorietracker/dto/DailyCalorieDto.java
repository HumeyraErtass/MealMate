package com.humeyra.calorietracker.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DailyCalorieDto {

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Date is required")
    private LocalDate date;

    @Min(value = 0, message = "Calories cannot be negative")
    @Max(value = 10000, message = "Calories too high")
    private Integer totalCalories;
}
