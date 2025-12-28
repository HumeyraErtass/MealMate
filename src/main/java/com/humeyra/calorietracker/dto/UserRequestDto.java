package com.humeyra.calorietracker.dto;

import jakarta.validation.constraints.*;

@Getter
@Setter
public class UserRequestDto {

    @NotBlank
    private String fullName;

    @Email
    private String email;

    @Min(10)
    private Integer age;

    @Positive
    private Double height;

    @Positive
    private Double weight;
}
