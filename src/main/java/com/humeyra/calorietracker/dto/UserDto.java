package main.java.com.humeyra.calorietracker.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @Min(value = 10, message = "Age must be at least 10")
    @Max(value = 120, message = "Age must be less than 120")
    private Integer age;
}
