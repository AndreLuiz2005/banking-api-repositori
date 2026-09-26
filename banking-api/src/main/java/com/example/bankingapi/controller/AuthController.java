package com.example.bankingapi.controller;

import com.example.bankingapi.dto.LoginRequest;
import com.example.bankingapi.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        return authService.autenticar(
                request.getEmail(),
                request.getSenha()
        );
    }
}
