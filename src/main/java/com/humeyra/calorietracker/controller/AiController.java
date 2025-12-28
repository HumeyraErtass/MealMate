package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.service.CaloriePredictionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@RequiredArgsConstructor
public class AiController {

    private final CaloriePredictionService service;

    @GetMapping("/predict")
    public int predict(
            @RequestParam Double weight,
            @RequestParam Double height,
            @RequestParam Integer age) {

        return service.predictDailyCalorie(weight, height, age);
    }
}
