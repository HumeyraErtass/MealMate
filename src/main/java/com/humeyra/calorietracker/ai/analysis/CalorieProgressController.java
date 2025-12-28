package com.humeyra.calorietracker.ai.analysis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ai/progress")
@RequiredArgsConstructor
public class CalorieProgressController {

    private final CalorieTrendAiService service;

    @PostMapping("/analyze")
    public CalorieProgressResponse analyze(
            @RequestParam PeriodType period,
            @RequestParam int targetCalories,
            @RequestBody List<Integer> dailyCalories
    ) {
        return service.analyze(period, targetCalories, dailyCalories);
    }
}
