package main.java.com.humeyra.calorietracker.meal;

import com.humeyra.calorietracker.meal.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/meals")
@RequiredArgsConstructor
public class MealController {

    private final MealService mealService;

    @PostMapping
    public MealResponse addMeal(@RequestBody MealRequest request,
                                Principal principal) {
        return mealService.addMeal(request, principal);
    }

    @GetMapping
    public List<MealResponse> getMyMeals(Principal principal) {
        return mealService.getMyMeals(principal);
    }

    @GetMapping("/date")
    public List<MealResponse> getMealsByDate(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate date,
            Principal principal) {

        return mealService.getMealsByDate(date, principal);
    }
}
