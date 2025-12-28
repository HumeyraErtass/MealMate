package com.humeyra.calorietracker.ai;

public class NutritionRuleEngine {

    public static NutritionAdvice evaluate(
            int targetCalories,
            int consumedCalories,
            double complianceScore
    ) {

        if (complianceScore >= 90) {
            return new NutritionAdvice(
                    "Excellent Performance",
                    "You are perfectly aligned with your calorie goals. Maintain your current nutrition plan.",
                    "LOW"
            );
        }

        if (consumedCalories > targetCalories) {
            return new NutritionAdvice(
                    "Overconsumption Detected",
                    "Your calorie intake exceeded the daily target. Consider reducing portion sizes or increasing activity.",
                    "HIGH"
            );
        }

        if (consumedCalories < targetCalories * 0.7) {
            return new NutritionAdvice(
                    "Underconsumption Warning",
                    "Your calorie intake is significantly below target. Ensure adequate nutrition to avoid deficiencies.",
                    "MEDIUM"
            );
        }

        return new NutritionAdvice(
                "Moderate Alignment",
                "You are close to your calorie goal. Small adjustments can improve consistency.",
                "MEDIUM"
        );
    }
}
