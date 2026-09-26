package com.example.bankingapi.controller;

import com.example.bankingapi.dto.DepositRequest;
import com.example.bankingapi.dto.TransferRequest;
import com.example.bankingapi.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import com.example.bankingapi.dto.AccountResponse;


@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/deposit")
    public AccountResponse depositar(
            Authentication authentication,
            @Valid @RequestBody DepositRequest request) {

        String email = authentication.getName();

        return accountService.depositar(email, request);
    }

    @PostMapping("/withdraw")
    public AccountResponse sacar(
            Authentication authentication,
            @Valid @RequestBody DepositRequest request) {

        String email = authentication.getName();

        return accountService.sacar(email, request);
    }

    @PostMapping("/transfer")
    public AccountResponse transferir(
            Authentication authentication,
            @Valid @RequestBody TransferRequest request) {

        String email = authentication.getName();

        return accountService.transferir(email, request);
    }

    @GetMapping("/me")
    public ResponseEntity<AccountResponse> buscarMinhaConta(
            @AuthenticationPrincipal UserDetails userDetails) {
        String email = userDetails.getUsername();
        return ResponseEntity.ok(accountService.buscarMinhaConta(email));
    }
}