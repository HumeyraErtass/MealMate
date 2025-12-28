package com.humeyra.calorietracker.ai.analysis;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalorieTrendAiService {

    public CalorieProgressResponse analyze(
            PeriodType period,
            int targetCalories,
            List<Integer> dailyCalories
    ) {

        double average = dailyCalories
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        double deviation = average - targetCalories;

        CalorieTrend trend;
        String comment;

        if (Math.abs(deviation) <= 100) {
            trend = CalorieTrend.STABLE;
            comment =
                    "Beslenme düzeniniz istikrarlı ilerliyor. " +
                    "Hedef kalori seviyesine yakınsınız.";
        } else if (deviation < 0) {
            trend = CalorieTrend.IMPROVING;
            comment =
                    "Kalori alımınız hedefin altında seyrediyor. " +
                    "Kilo kontrolü açısından olumlu bir ilerleme gözleniyor.";
        } else {
            trend = CalorieTrend.WORSENING;
            comment =
                    "Kalori alımınız hedefin üzerinde. " +
                    "Uzun vadede kilo artışı riski oluşabilir.";
        }

        return CalorieProgressResponse.builder()
                .period(period)
                .targetCalories(targetCalories)
                .averageCalories(average)
                .deviation(deviation)
                .trend(trend)
                .aiComment(comment)
                .build();
    }
}
