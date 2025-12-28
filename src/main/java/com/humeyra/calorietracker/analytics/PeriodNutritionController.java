package main.java.com.humeyra.calorietracker.analytics;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/analytics/period")
@RequiredArgsConstructor
public class PeriodNutritionController {

    private final PeriodNutritionService service;

    @GetMapping
    public PeriodNutritionSummary analyze(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate start,

            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate end,

            @RequestParam PeriodType type,
            Principal principal) {

        return service.analyzePeriod(start, end, type, principal);
    }
}
