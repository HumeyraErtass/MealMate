package main.java.com.humeyra.calorietracker.analytics;

import com.humeyra.calorietracker.meal.Meal;
import com.humeyra.calorietracker.meal.MealRepository;
import com.humeyra.calorietracker.user.User;
import com.humeyra.calorietracker.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PeriodNutritionService {

    private final MealRepository mealRepository;
    private final UserRepository userRepository;

    public PeriodNutritionSummary analyzePeriod(
            LocalDate start,
            LocalDate end,
            PeriodType type,
            Principal principal) {

        User user = userRepository.findByEmail(principal.getName())
                .orElseThrow();

        List<Meal> meals = mealRepository
                .findByUserAndDateBetween(user, start, end);

        int totalCalories = meals.stream()
                .mapToInt(m -> m.getCalories() != null ? m.getCalories() : 0)
                .sum();

        double protein = meals.stream()
                .mapToDouble(m -> m.getProtein() != null ? m.getProtein() : 0)
                .sum();

        double carbs = meals.stream()
                .mapToDouble(m -> m.getCarbs() != null ? m.getCarbs() : 0)
                .sum();

        double fat = meals.stream()
                .mapToDouble(m -> m.getFat() != null ? m.getFat() : 0)
                .sum();

        long days = start.until(end).getDays() + 1;

        return PeriodNutritionSummary.builder()
                .periodType(type)
                .startDate(start)
                .endDate(end)
                .totalCalories(totalCalories)
                .averageCalories(totalCalories / (double) days)
                .averageProtein(protein / days)
                .averageCarbs(carbs / days)
                .averageFat(fat / days)
                .build();
    }
}
