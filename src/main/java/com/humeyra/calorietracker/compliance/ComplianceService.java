package com.humeyra.calorietracker.compliance;

import org.springframework.stereotype.Service;

@Service
public class ComplianceService {

    public ComplianceResult calculateCompliance(
            int targetCalories,
            int consumedCalories
    ) {

        double score = ComplianceScoreCalculator
                .calculate(targetCalories, consumedCalories);

        String status;

        if (score >= 90) {
            status = "EXCELLENT";
        } else if (score >= 75) {
            status = "GOOD";
        } else if (score >= 50) {
            status = "AVERAGE";
        } else {
            status = "POOR";
        }

        return new ComplianceResult(
                targetCalories,
                consumedCalories,
                score,
                status
        );
    }
}
