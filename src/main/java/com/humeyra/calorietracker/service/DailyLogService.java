package com.humeyra.calorietracker.service;

import com.humeyra.calorietracker.entity.DailyLog;
import com.humeyra.calorietracker.repository.DailyLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DailyLogService {

    private final DailyLogRepository dailyLogRepository;

    public DailyLog save(DailyLog log) {
        return dailyLogRepository.save(log);
    }

    public List<DailyLog> getDailyLogs(Long userId, LocalDate date) {
        return dailyLogRepository.findByUserIdAndDate(userId, date);
    }
}
