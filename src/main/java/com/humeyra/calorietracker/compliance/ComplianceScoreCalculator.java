package com.humeyra.calorietracker.compliance;

public class ComplianceScoreCalculator {

    public static double calculate(int target, int consumed) {

        if (target <= 0) {
            return 0;
        }

        double deviation = Math.abs(consumed - target);
        double deviationRatio = deviation / target;

        double score = 100 - (deviationRatio * 100);

        if (score < 0) {
            score = 0;
        }

        return Math.round(score * 100.0) / 100.0;
    }
}
