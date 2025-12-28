package com.humeyra.calorietracker.ai.personalization;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai/personalized-calorie")
@RequiredArgsConstructor
public class PersonalizedCalorieController {

    private final PersonalizedCalorieAiService service;

    @PostMapping
    public PersonalizedCalorieResponse calculate(
            @RequestBody UserProfileRequest request
    ) {
        return service.calculate(request);
    }
}
