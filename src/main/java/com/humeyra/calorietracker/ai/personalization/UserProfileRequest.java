package com.humeyra.calorietracker.ai.personalization;

import lombok.Data;

@Data
public class UserProfileRequest {

    private int age;
    private double heightCm;
    private double weightKg;
    private Gender gender;
    private ActivityLevel activityLevel;
    private GoalType goal;
}
