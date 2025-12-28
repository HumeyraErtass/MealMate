package com.humeyra.calorietracker.controller;

import com.humeyra.calorietracker.entity.DailyLog;
import com.humeyra.calorietracker.service.DailyLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class DailyLogController {

    private final DailyLogService dailyLogService;

    @PostMapping
    public DailyLog create(@RequestBody DailyLog log) {
        return dailyLogService.save(log);
    }

    @GetMapping
    public List<DailyLog> getDailyLogs(
            @RequestParam Long userId,
            @RequestParam LocalDate date) {
        return dailyLogService.getDailyLogs(userId, date);
    }
}
