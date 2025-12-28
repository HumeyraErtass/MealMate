package main.java.com.humeyra.calorietracker.ai;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai/calorie-target")
@RequiredArgsConstructor
public class CalorieTargetController {

    private final CalorieTargetService service;

    @PostMapping
    public CalorieTargetResponse calculate(@RequestBody UserProfile profile) {
        return service.calculate(profile);
    }
}
