package com.hackaton.case2.user.controller;

import com.hackaton.case2.user.dto.RegisterUserRequest;
import com.hackaton.case2.user.entity.User;
import com.hackaton.case2.user.repository.UserRepo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
@Tag(name = "UserController", description = "Все действия с пользователями (от регистрации до поиска)")
public class UserController {
    private final UserRepo userRepo;
    @Operation(summary = "Регистрация нового пользователя (потом надо подтвердить почту)")
    @PostMapping
    @Transactional
    public String registerUser(@RequestBody RegisterUserRequest dto) {
        System.out.println(dto.toString());
        User user = User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .firstname(dto.getFirstName())
                .lastname(dto.getLastName())
                .patronymic(dto.getPatronymic())
                .build();
        userRepo.insertUser(user);
        return user.toString();
    }

    @Operation(summary = "Подтверждение почты после регистрации")
    @PostMapping("me/email-confirmation")
    public void confirmEmail(String confirmEmailCode) {

    }

}
