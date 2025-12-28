package com.humeyra.calorietracker.ai.personalization;

import org.springframework.stereotype.Service;

@Service
public class PersonalizedCalorieAiService {

    public PersonalizedCalorieResponse calculate(UserProfileRequest req) {

        double bmr = BmrCalculator.calculate(
                req.getWeightKg(),
                req.getHeightCm(),
                req.getAge(),
                req.getGender()
        );

        double tdee = TdeeCalculator.calculate(bmr, req.getActivityLevel());

        int recommended;
        String explanation;

        switch (req.getGoal()) {
            case WEIGHT_LOSS -> {
                recommended = (int) (tdee - 500);
                explanation =
                        "Kilo vermeyi desteklemek için günlük kalori ihtiyacınızdan " +
                        "yaklaşık 500 kcal düşürülmüştür.";
            }
            case WEIGHT_GAIN -> {
                recommended = (int) (tdee + 400);
                explanation =
                        "Sağlıklı kilo artışı için günlük kalori ihtiyacınıza " +
                        "ekstra enerji eklenmiştir.";
            }
            default -> {
                recommended = (int) tdee;
                explanation =
                        "Mevcut kilonuzu korumak için hesaplanan günlük kalori ihtiyacı önerilmektedir.";
            }
        }

        return PersonalizedCalorieResponse.builder()
                .bmr(bmr)
                .tdee(tdee)
                .recommendedCalories(recommended)
                .aiExplanation(explanation)
                .build();
    }
}
