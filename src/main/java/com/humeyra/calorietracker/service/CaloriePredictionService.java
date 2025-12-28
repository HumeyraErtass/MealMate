package com.humeyra.calorietracker.service;

import org.springframework.stereotype.Service;

@Service
public class CaloriePredictionService {

    public int predictDailyCalorie(Double weight, Double height, Integer age) {
        return (int) (10 * weight + 6.25 * height - 5 * age + 5);
    }
}
