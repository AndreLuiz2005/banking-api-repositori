package com.example.bankingapi.service;

import com.example.bankingapi.entity.User;
import com.example.bankingapi.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.bankingapi.service.JwtService;
import com.example.bankingapi.exception.InvalidCredentialsException;


@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public String autenticar(String email, String senha) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new InvalidCredentialsException("E-mail ou senha inválidos"));

        if (!passwordEncoder.matches(senha, user.getSenha())) {
            throw new InvalidCredentialsException("E-mail ou senha inválidos");
        }

        return jwtService.gerarToken(user);
    }

}
