package com.hackaton.case2.user.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Data // Генерирует геттеры, сеттеры, toString(), equals() и hashCode()
@AllArgsConstructor // Генерирует конструктор со всеми параметрами
@NoArgsConstructor
public class RegisterUserRequest {
    @NotNull @NotBlank
    private String email;

    @NotNull @NotBlank @Size(min = 10)
    private String password;

    @NotNull @NotBlank
    private String firstName;

    @NotNull @NotBlank
    private String lastName;

    private String patronymic;
}

