package com.securityv2.Springsecurityv2.controller.request;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO {

    @Email
    @NotBlank
    private String email;
    
    @NotBlank
    private String username;

    @NotBlank
    private String password;
    private Set<String> roles;
    
}
