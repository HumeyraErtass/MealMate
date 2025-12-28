package com.humeyra.calorietracker.ai.personalization;

public class BmrCalculator {

    public static double calculate(
            double weight,
            double height,
            int age,
            Gender gender
    ) {
        if (gender == Gender.MALE) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        }
        return 10 * weight + 6.25 * height - 5 * age - 161;
    }
}
