package com.humeyra.calorietracker.service;

import com.humeyra.calorietracker.entity.Food;
import com.humeyra.calorietracker.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public Food save(Food food) {
        return foodRepository.save(food);
    }

    public List<Food> getAll() {
        return foodRepository.findAll();
    }
}
