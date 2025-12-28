package com.humeyra.calorietracker.report;

import com.humeyra.calorietracker.compliance.ComplianceScoreCalculator;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeeklyReportService {

    public WeeklyReport generateWeeklyReport(
            List<Integer> targetCalories,
            List<Integer> consumedCalories
    ) {

        List<DailyPerformance> dailyPerformances = new ArrayList<>();
        double totalScore = 0;

        for (int i = 0; i < 7; i++) {

            double score = ComplianceScoreCalculator.calculate(
                    targetCalories.get(i),
                    consumedCalories.get(i)
            );

            dailyPerformances.add(
                    new DailyPerformance(
                            LocalDate.now().minusDays(6 - i),
                            targetCalories.get(i),
                            consumedCalories.get(i),
                            score
                    )
            );

            totalScore += score;
        }

        double average = totalScore / 7;

        String status;
        if (average >= 85) {
            status = "HIGH_ADHERENCE";
        } else if (average >= 65) {
            status = "MODERATE_ADHERENCE";
        } else {
            status = "LOW_ADHERENCE";
        }

        return new WeeklyReport(
                dailyPerformances,
                Math.round(average * 100.0) / 100.0,
                status
        );
    }
}
