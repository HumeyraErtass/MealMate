package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.dto.CalorieReportDto;
import com.humeyra.calorietracker.service.CalorieReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class CalorieReportController {

    private final CalorieReportService service;

    @GetMapping("/weekly/{userId}")
    public CalorieReportDto weeklyReport(@PathVariable Long userId) {

        LocalDate end = LocalDate.now();
        LocalDate start = end.minusDays(7);

        return service.getReport(userId, start, end);
    }

    @GetMapping("/monthly/{userId}")
    public CalorieReportDto monthlyReport(@PathVariable Long userId) {

        LocalDate end = LocalDate.now();
        LocalDate start = end.minusDays(30);

        return service.getReport(userId, start, end);
    }
}
