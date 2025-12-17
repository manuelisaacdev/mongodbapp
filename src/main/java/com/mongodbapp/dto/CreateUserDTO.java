package com.mongodbapp.dto;

import com.mongodbapp.model.Gender;
import com.mongodbapp.model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record CreateUserDTO(
        @NotBlank String name,
        @NotNull Gender gender,
        @NotNull LocalDate birthOfDate,
        @NotNull Role role,
        @NotBlank String email,
        @Size(min = 8, max = 32) @NotBlank String password) {
}
