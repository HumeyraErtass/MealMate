package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.model.Meal;
import com.humeyra.calorietracker.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
@RequiredArgsConstructor
public class MealController {
    private final MealService mealService;

    @PostMapping
    public Meal addMeal(@RequestBody Meal meal) {
        return mealService.addMeal(meal);
    }

    @GetMapping("/user/{userId}")
    public List<Meal> getMealsByUser(@PathVariable Long userId) {
        return mealService.getMealsByUser(userId);
    }
}
