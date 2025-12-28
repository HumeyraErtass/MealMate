package com.humeyra.calorietracker.ai.tracking;

import org.springframework.stereotype.Service;

@Service
public class DailyCalorieAiService {

    public DailyCalorieSummaryResponse analyze(
            int targetCalories,
            int consumedCalories
    ) {

        int difference = consumedCalories - targetCalories;

        DailyCalorieStatus status;
        String feedback;

        if (difference < -150) {
            status = DailyCalorieStatus.DEFICIT;
            feedback =
                    "Günlük kalori alımınız hedefin altında. " +
                    "Enerji düşüklüğü yaşamamak için ara öğün ekleyebilirsiniz.";
        } else if (difference > 150) {
            status = DailyCalorieStatus.EXCESS;
            feedback =
                    "Günlük kalori alımınız hedefin üzerinde. " +
                    "Bir sonraki öğünde daha hafif tercihler yapmanız önerilir.";
        } else {
            status = DailyCalorieStatus.IDEAL;
            feedback =
                    "Günlük kalori alımınız hedefle uyumlu. " +
                    "Beslenme dengeniz korunuyor.";
        }

        return DailyCalorieSummaryResponse.builder()
                .targetCalories(targetCalories)
                .consumedCalories(consumedCalories)
                .difference(difference)
                .status(status)
                .aiFeedback(feedback)
                .build();
    }
}
