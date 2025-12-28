package com.humeyra.calorietracker.ai.tracking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai/calorie")
@RequiredArgsConstructor
public class DailyCalorieController {

    private final DailyCalorieAiService service;

    @GetMapping("/analyze")
    public DailyCalorieSummaryResponse analyze(
            @RequestParam int target,
            @RequestParam int consumed
    ) {
        return service.analyze(target, consumed);
    }
}
