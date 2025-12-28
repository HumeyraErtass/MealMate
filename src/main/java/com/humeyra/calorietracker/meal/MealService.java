package main.java.com.humeyra.calorietracker.meal;

import com.humeyra.calorietracker.meal.dto.*;
import com.humeyra.calorietracker.user.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MealService {

    private final MealRepository mealRepository;
    private final UserRepository userRepository;

    public MealResponse addMeal(MealRequest request, Principal principal) {

        User user = userRepository.findByEmail(principal.getName())
                .orElseThrow();

        Meal meal = Meal.builder()
                .name(request.getName())
                .calories(request.getCalories())
                .protein(request.getProtein())
                .carbs(request.getCarbs())
                .fat(request.getFat())
                .date(request.getDate())
                .user(user)
                .build();

        Meal saved = mealRepository.save(meal);

        return mapToResponse(saved);
    }

    public List<MealResponse> getMyMeals(Principal principal) {

        User user = userRepository.findByEmail(principal.getName())
                .orElseThrow();

        return mealRepository.findByUser(user)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    public List<MealResponse> getMealsByDate(LocalDate date, Principal principal) {

        User user = userRepository.findByEmail(principal.getName())
                .orElseThrow();

        return mealRepository.findByUserAndDate(user, date)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private MealResponse mapToResponse(Meal meal) {
        return MealResponse.builder()
                .id(meal.getId())
                .name(meal.getName())
                .calories(meal.getCalories())
                .protein(meal.getProtein())
                .carbs(meal.getCarbs())
                .fat(meal.getFat())
                .date(meal.getDate())
                .build();
    }
}
