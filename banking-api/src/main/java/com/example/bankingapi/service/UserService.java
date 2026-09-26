package com.example.bankingapi.service;

import com.example.bankingapi.dto.UserResponse;
import com.example.bankingapi.dto.UserRequest;
import com.example.bankingapi.entity.User;
import com.example.bankingapi.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.bankingapi.exception.UserNotFoundException;
import com.example.bankingapi.exception.EmailAlreadyExistsException;
import com.example.bankingapi.repository.AccountRepository;
import com.example.bankingapi.entity.Account;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    private final AccountRepository accountRepository;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.accountRepository = accountRepository;
    }

    public User criarUsuario(User user){
        return userRepository.save(user);
    }

    private String gerarNumeroConta() {

        String numero;

        do {
            numero = String.valueOf(
                    1000000000L + (long) (Math.random() * 9000000000L)
            );
        } while (accountRepository.existsByNumero(numero));

        return numero;
    }

    @Transactional
    public UserResponse criarUsuario(UserRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new EmailAlreadyExistsException("E-mail já cadastrado");
        }

        User user = new User();

        user.setNome(request.getNome());
        user.setEmail(request.getEmail());
        user.setSenha(passwordEncoder.encode(request.getSenha()));

        User salvo = userRepository.save(user);

        Account account = new Account();
        account.setUser(salvo);

        // alterado
        account.setNumero(gerarNumeroConta());

        accountRepository.save(account);

        return new UserResponse(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail()
        );
    }

    public User buscarPorId(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuário não encontrado"));
    }
}
