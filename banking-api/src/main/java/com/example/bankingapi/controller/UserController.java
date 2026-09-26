package com.example.bankingapi.controller;

import  com.example.bankingapi.dto.UserRequest;
import com.example.bankingapi.dto.UserResponse;
import com.example.bankingapi.entity.User;
import com.example.bankingapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse criarUsuario(@Valid @RequestBody UserRequest request) {
        return userService.criarUsuario(request);
    }

    @GetMapping("/{id}")
    public UserResponse buscarUsuario(@PathVariable Long id) {

        User user = userService.buscarPorId(id);

        return new UserResponse(
                user.getId(),
                user.getNome(),
                user.getEmail()
        );
    }
}