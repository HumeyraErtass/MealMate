package com.humeyra.calorietracker.ai.personalization;

public class TdeeCalculator {

    public static double calculate(double bmr, ActivityLevel activityLevel) {
        return bmr * activityLevel.getMultiplier();
    }
}
