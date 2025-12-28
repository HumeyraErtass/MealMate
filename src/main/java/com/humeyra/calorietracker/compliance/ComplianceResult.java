package com.humeyra.calorietracker.compliance;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComplianceResult {

    private int targetCalories;
    private int consumedCalories;
    private double complianceScore;
    private String status;
}
