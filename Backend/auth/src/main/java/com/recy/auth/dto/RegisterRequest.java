package com.recy.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class RegisterRequest {
    @NotBlank
    private String username;

    @Email
    private String email;

    @NotBlank
    private String password;
}
