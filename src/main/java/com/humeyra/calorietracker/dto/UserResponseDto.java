package com.humeyra.calorietracker.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDto {
    private Long id;
    private String fullName;
    private String email;
}
