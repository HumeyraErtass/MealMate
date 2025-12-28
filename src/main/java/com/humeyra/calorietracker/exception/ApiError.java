package com.humeyra.calorietracker.exception;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiError {

    private String message;
    private Integer status;
    private LocalDateTime timestamp;
}
