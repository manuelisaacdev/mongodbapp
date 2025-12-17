package com.mongodbapp.dto;

import com.mongodbapp.model.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record UpdateUserDTO(
        @NotBlank String name,
        @NotNull Gender gender,
        @NotNull LocalDate birthOfDate
) {
}
