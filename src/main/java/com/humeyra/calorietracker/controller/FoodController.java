package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.entity.Food;
import com.humeyra.calorietracker.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }
}
