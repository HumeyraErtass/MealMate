package com.humeyra.calorietracker.service;

import com.humeyra.calorietracker.model.Meal;
import com.humeyra.calorietracker.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MealService {
    private final MealRepository mealRepository;

    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getMealsByUser(Long userId) {
        return mealRepository.findByUserId(userId);
    }
}
