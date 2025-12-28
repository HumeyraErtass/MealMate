package com.humeyra.calorietracker.ai.adaptation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai/weekly-adjustment")
@RequiredArgsConstructor
public class WeeklyCalorieAdjustmentController {

    private final WeeklyCalorieAdjustmentService service;

    @PostMapping
    public WeeklyCalorieAdjustmentResponse adjust(
            @RequestBody WeeklyAdjustmentRequest request
    ) {
        return service.adjust(request);
    }
}
