package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.entity.DailyCalorie;
import com.humeyra.calorietracker.service.DailyCalorieService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import com.humeyra.calorietracker.dto.DailyCalorieDto;


@RestController
@RequestMapping("/api/calories")
@RequiredArgsConstructor
public class DailyCalorieController {

    private final DailyCalorieService service;

    @PostMapping
    public DailyCalorie add(@RequestBody DailyCalorie calorie) {
        return service.save(calorie);
    }

    @GetMapping("/{userId}")
    public List<DailyCalorieDto> getCalories(@PathVariable Long userId) {
        return service.getUserCalories(userId);
    }

    @PostMapping
    public ResponseEntity<DailyCalorieDto> save(
            @Valid @RequestBody DailyCalorieDto dto) {

        return ResponseEntity.ok(service.save(dto));
    }


}


