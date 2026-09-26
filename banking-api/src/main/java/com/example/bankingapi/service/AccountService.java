package com.example.bankingapi.service;

import com.example.bankingapi.dto.DepositRequest;
import com.example.bankingapi.entity.Account;
import com.example.bankingapi.entity.Transaction;
import com.example.bankingapi.entity.TransactionType;
import com.example.bankingapi.repository.AccountRepository;
import com.example.bankingapi.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import com.example.bankingapi.dto.AccountResponse;
import com.example.bankingapi.exception.AccountNotFoundException;
import com.example.bankingapi.exception.InsufficientBalanceException;
import com.example.bankingapi.dto.TransferRequest;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;

@Service
public class AccountService {

    private final TransactionRepository transactionRepository;

    private final AccountRepository accountRepository;

    public AccountService(
            AccountRepository accountRepository,
            TransactionRepository transactionRepository) {

        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    public AccountResponse buscarMinhaConta(String email) {

        Account account = accountRepository.findByUserEmail(email)
                .orElseThrow(() ->
                        new AccountNotFoundException("Conta não encontrada"));

        return new AccountResponse(
                account.getId(),
                account.getNumero(),
                account.getSaldo()
        );
    }

    @Transactional
    public AccountResponse depositar(String email, DepositRequest request) {

        Account account = accountRepository.findByUserEmail(email)
                .orElseThrow(() ->
                        new AccountNotFoundException("Conta não encontrada"));

        account.setSaldo(
                account.getSaldo().add(request.getValor())
        );

        Account salva = accountRepository.save(account);

        Transaction transaction = new Transaction();

        transaction.setTipo(TransactionType.DEPOSITO);
        transaction.setValor(request.getValor());
        transaction.setData(LocalDateTime.now());
        transaction.setAccount(salva);

        transactionRepository.save(transaction);

        return new AccountResponse(
                salva.getId(),
                salva.getNumero(),
                salva.getSaldo()
        );
    }

    @Transactional
    public AccountResponse sacar(String email, DepositRequest request) {

        Account account = accountRepository.findByUserEmail(email)
                .orElseThrow(() ->
                        new AccountNotFoundException("Conta não encontrada"));

        if (account.getSaldo().compareTo(request.getValor()) < 0) {
            throw new InsufficientBalanceException("Saldo insuficiente");
        }

        account.setSaldo(
                account.getSaldo().subtract(request.getValor())
        );

        Account salva = accountRepository.save(account);

        Transaction transaction = new Transaction();

        transaction.setTipo(TransactionType.SAQUE);
        transaction.setValor(request.getValor());
        transaction.setData(LocalDateTime.now());
        transaction.setAccount(salva);

        transactionRepository.save(transaction);

        return new AccountResponse(
                salva.getId(),
                salva.getNumero(),
                salva.getSaldo()
        );
    }

    @Transactional
    public AccountResponse transferir(
            String email,
            TransferRequest request) {

        Account contaOrigem = accountRepository.findByUserEmail(email)
                .orElseThrow(() ->
                        new AccountNotFoundException("Conta de origem não encontrada"));

        Account contaDestino = accountRepository.findById(request.getContaDestino())
                .orElseThrow(() ->
                        new AccountNotFoundException("Conta de destino não encontrada"));

        if (contaOrigem.getId().equals(contaDestino.getId())) {
            throw new IllegalArgumentException("Não é possível transferir para a própria conta");
        }

        contaOrigem.setSaldo(
                contaOrigem.getSaldo().subtract(request.getValor())
        );

        contaDestino.setSaldo(
                contaDestino.getSaldo().add(request.getValor())
        );

        accountRepository.save(contaOrigem);
        accountRepository.save(contaDestino);

        Transaction enviada = new Transaction();
        enviada.setTipo(TransactionType.TRANSFERENCIA_ENVIADA);
        enviada.setValor(request.getValor());
        enviada.setData(LocalDateTime.now());
        enviada.setAccount(contaOrigem);

        Transaction recebida = new Transaction();
        recebida.setTipo(TransactionType.TRANSFERENCIA_RECEBIDA);
        recebida.setValor(request.getValor());
        recebida.setData(LocalDateTime.now());
        recebida.setAccount(contaDestino);

        transactionRepository.save(enviada);
        transactionRepository.save(recebida);

        return new AccountResponse(
                contaOrigem.getId(),
                contaOrigem.getNumero(),
                contaOrigem.getSaldo()
        );
    }
}