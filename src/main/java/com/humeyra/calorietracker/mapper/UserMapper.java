package com.humeyra.calorietracker.mapper;

import com.humeyra.calorietracker.dto.UserRequestDto;
import com.humeyra.calorietracker.dto.UserResponseDto;
import com.humeyra.calorietracker.entity.User;

public class UserMapper {

    public static User toEntity(UserRequestDto dto) {
        return User.builder()
                .fullName(dto.getFullName())
                .email(dto.getEmail())
                .age(dto.getAge())
                .height(dto.getHeight())
                .weight(dto.getWeight())
                .build();
    }

    public static UserResponseDto toDto(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .build();
    }
}
