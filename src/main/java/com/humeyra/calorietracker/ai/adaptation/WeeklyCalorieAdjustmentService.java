package com.humeyra.calorietracker.ai.adaptation;

import org.springframework.stereotype.Service;

@Service
public class WeeklyCalorieAdjustmentService {

    public WeeklyCalorieAdjustmentResponse adjust(WeeklyAdjustmentRequest request) {

        double oldTarget = request.getCurrentCalorieTarget();

        double week1 = request.getLastTwoWeeks().get(0).getWeightKg();
        double week2 = request.getLastTwoWeeks().get(1).getWeightKg();

        double weightDiff = week2 - week1;
        double newTarget = oldTarget;
        String feedback;

        if (weightDiff < -0.7) {
            newTarget += 200;
            feedback =
                    "Hedeflenen kilo kaybı beklenenden hızlı. " +
                    "Kas kaybını önlemek için kalori artırıldı.";
        } 
        else if (weightDiff > -0.2) {
            newTarget -= 200;
            feedback =
                    "Kilo kaybı yavaş ilerliyor. " +
                    "Daha etkili sonuç için kalori azaltıldı.";
        } 
        else {
            feedback =
                    "Kilo değişimi ideal aralıkta. " +
                    "Mevcut kalori hedefi korunuyor.";
        }

        return WeeklyCalorieAdjustmentResponse.builder()
                .previousTarget(oldTarget)
                .newTarget(newTarget)
                .aiFeedback(feedback)
                .build();
    }
}
