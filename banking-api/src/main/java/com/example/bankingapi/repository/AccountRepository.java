package com.example.bankingapi.repository;

import com.example.bankingapi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUserId(Long userId);

    Optional<Account> findByUserEmail(String email);

    boolean existsByNumero(String numero);
}