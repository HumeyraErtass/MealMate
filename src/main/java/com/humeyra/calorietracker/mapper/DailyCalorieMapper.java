package com.humeyra.calorietracker.mapper;

import com.humeyra.calorietracker.dto.DailyCalorieDto;
import com.humeyra.calorietracker.entity.DailyCalorie;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DailyCalorieMapper {

    DailyCalorieDto toDto(DailyCalorie entity);

    List<DailyCalorieDto> toDtoList(List<DailyCalorie> entityList);
}
