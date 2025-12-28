package com.humeyra.calorietracker.repository;

import com.humeyra.calorietracker.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
