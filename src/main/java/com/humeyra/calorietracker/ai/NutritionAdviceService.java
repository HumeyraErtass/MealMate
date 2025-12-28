package com.humeyra.calorietracker.ai;

import com.humeyra.calorietracker.compliance.ComplianceScoreCalculator;
import org.springframework.stereotype.Service;

@Service
public class NutritionAdviceService {

    public NutritionAdvice generateAdvice(
            int targetCalories,
            int consumedCalories
    ) {

        double complianceScore = ComplianceScoreCalculator.calculate(
                targetCalories,
                consumedCalories
        );

        return NutritionRuleEngine.evaluate(
                targetCalories,
                consumedCalories,
                complianceScore
        );
    }
}
