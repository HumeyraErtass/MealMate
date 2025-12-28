package com.humeyra.calorietracker.service;

import com.humeyra.calorietracker.entity.DailyCalorie;
import com.humeyra.calorietracker.repository.DailyCalorieRepository;
import lombok.RequiredArgsConstructor;
import com.humeyra.calorietracker.exception.ResourceNotFoundException;


import java.util.List;

import org.springframework.stereotype.Service;
import com.humeyra.calorietracker.dto.DailyCalorieDto;
import com.humeyra.calorietracker.mapper.DailyCalorieMapper;

@Service
@RequiredArgsConstructor
public class DailyCalorieService {

    private final DailyCalorieRepository repository;
    private final DailyCalorieMapper mapper;


    public DailyCalorie save(DailyCalorie calorie) {
        return repository.save(calorie);
    }

    public List<DailyCalorieDto> getUserCalories(Long userId) {

        List<DailyCalorie> list = repository.findByUserId(userId);

        if (list.isEmpty()) {
            throw new ResourceNotFoundException("User calorie data not found");
        }

        return mapper.toDtoList(list);
    }


}
