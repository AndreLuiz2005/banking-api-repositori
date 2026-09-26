package com.example.bankingapi.service;

import com.example.bankingapi.dto.TransactionResponse;
import com.example.bankingapi.entity.Account;
import com.example.bankingapi.entity.Transaction;
import com.example.bankingapi.exception.AccountNotFoundException;
import com.example.bankingapi.repository.AccountRepository;
import com.example.bankingapi.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public TransactionService(
            AccountRepository accountRepository,
            TransactionRepository transactionRepository) {

        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    public List<TransactionResponse> buscarHistorico(String email) {

        Account account = accountRepository.findByUserEmail(email)
                .orElseThrow(() ->
                        new AccountNotFoundException("Conta não encontrada"));

        List<Transaction> transactions =
                transactionRepository
                        .findByAccountIdOrderByDataDesc(account.getId());

        return transactions.stream()
                .map(transaction -> new TransactionResponse(
                        transaction.getId(),
                        transaction.getTipo(),
                        transaction.getValor(),
                        transaction.getData()
                ))
                .toList();
    }
}