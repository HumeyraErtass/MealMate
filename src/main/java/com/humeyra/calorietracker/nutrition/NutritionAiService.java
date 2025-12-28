package com.humeyra.calorietracker.ai.nutrition;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionAiService {

    public NutritionRecommendationResponse generate(int dailyCalories) {

        int proteinCalories = (int) (dailyCalories * 0.30);
        int carbCalories = (int) (dailyCalories * 0.45);
        int fatCalories = (int) (dailyCalories * 0.25);

        MacroDistribution macros = MacroDistribution.builder()
                .proteinGrams(proteinCalories / 4)
                .carbGrams(carbCalories / 4)
                .fatGrams(fatCalories / 9)
                .build();

        List<DailyMenuItem> menu = List.of(
                new DailyMenuItem("Kahvaltı", "Yulaf + Yumurta + Muz", 400),
                new DailyMenuItem("Öğle", "Izgara tavuk + Bulgur + Yoğurt", 600),
                new DailyMenuItem("Ara Öğün", "Badem + Elma", 250),
                new DailyMenuItem("Akşam", "Somon + Sebze + Zeytinyağı", 550)
        );

        String aiComment =
                "Protein ağırlıklı ve dengeli bir makro dağılımı önerilmektedir. " +
                "Kas kaybını önlemek ve metabolizmayı desteklemek için uygundur.";

        return NutritionRecommendationResponse.builder()
                .dailyCalories(dailyCalories)
                .macros(macros)
                .menu(menu)
                .aiComment(aiComment)
                .build();
    }
}
