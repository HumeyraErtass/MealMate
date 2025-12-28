package com.humeyra.calorietracker.ai.adaptation;

import java.time.LocalDate;
import lombok.Data;

@Data
public class WeeklyWeightEntry {

    private LocalDate date;
    private double weightKg;
}
