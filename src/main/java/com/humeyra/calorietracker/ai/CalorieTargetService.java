package main.java.com.humeyra.calorietracker.ai;

import org.springframework.stereotype.Service;

@Service
public class CalorieTargetService {

    public CalorieTargetResponse calculate(UserProfile profile) {

        double bmr = BmrCalculator.calculate(profile);
        double tdee = bmr * profile.getActivityLevel().getFactor();

        int targetCalories;

        String recommendation;

        switch (profile.getGoalType()) {
            case LOSE_WEIGHT -> {
                targetCalories = (int) (tdee - 500);
                recommendation = "Kilo vermek için günlük kalori açığı önerilir.";
            }
            case GAIN_WEIGHT -> {
                targetCalories = (int) (tdee + 400);
                recommendation = "Kas kazanımı için kalori fazlası önerilir.";
            }
            default -> {
                targetCalories = (int) tdee;
                recommendation = "Mevcut kilonuzu korumak için denge sağlanmalıdır.";
            }
        }

        return CalorieTargetResponse.builder()
                .bmr(bmr)
                .tdee(tdee)
                .targetCalories(targetCalories)
                .recommendation(recommendation)
                .build();
    }
}
