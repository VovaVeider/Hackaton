package com.hackaton.case2.user.entity;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class User {
    private UUID id;
    private String firstname;
    private String lastname;
    private String patronymic;
    private String email;
    private String password;
}
