package com.example.bankingapi.service;

import com.example.bankingapi.dto.UserResponse;
import com.example.bankingapi.dto.UserRequest;
import com.example.bankingapi.entity.User;
import com.example.bankingapi.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder){

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User criarUsuario(User user){
        return userRepository.save(user);
    }

    public UserResponse criarUsuario(UserRequest request) {

        User user = new User();

        user.setNome(request.getNome());
        user.setEmail(request.getEmail());
        user.setSenha(passwordEncoder.encode(request.getSenha()));

        User salvo = userRepository.save(user);

        return new UserResponse(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail()
        );

    }
}
