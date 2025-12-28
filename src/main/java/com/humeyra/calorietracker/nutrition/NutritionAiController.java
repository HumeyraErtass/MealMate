package com.humeyra.calorietracker.ai.nutrition;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai/nutrition")
@RequiredArgsConstructor
public class NutritionAiController {

    private final NutritionAiService service;

    @GetMapping("/{dailyCalories}")
    public NutritionRecommendationResponse recommend(
            @PathVariable int dailyCalories
    ) {
        return service.generate(dailyCalories);
    }
}
