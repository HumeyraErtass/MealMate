package main.java.com.humeyra.calorietracker.ai;

import lombok.Data;

@Data
public class UserProfile {

    private int age;
    private double height; // cm
    private double weight; // kg
    private boolean male;

    private ActivityLevel activityLevel;
    private GoalType goalType;
}
