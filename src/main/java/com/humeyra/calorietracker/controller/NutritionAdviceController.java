package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.ai.NutritionAdvice;
import com.humeyra.calorietracker.ai.NutritionAdviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@RequiredArgsConstructor
public class NutritionAdviceController {

    private final NutritionAdviceService nutritionAdviceService;

    @GetMapping("/nutrition-advice")
    public NutritionAdvice getAdvice(
            @RequestParam int targetCalories,
            @RequestParam int consumedCalories
    ) {
        return nutritionAdviceService.generateAdvice(
                targetCalories,
                consumedCalories
        );
    }
}
