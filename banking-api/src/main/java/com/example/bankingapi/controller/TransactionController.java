package com.example.bankingapi.controller;

import com.example.bankingapi.dto.TransactionResponse;
import com.example.bankingapi.service.TransactionService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/history")
    public List<TransactionResponse> buscarHistorico(
            @AuthenticationPrincipal String email) {

        return transactionService.buscarHistorico(email);
    }
}