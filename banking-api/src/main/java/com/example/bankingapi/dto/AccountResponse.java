package com.example.bankingapi.dto;

import java.math.BigDecimal;

public class AccountResponse {

    private Long id;
    private String numero;
    private BigDecimal saldo;

    public AccountResponse(Long id, String numero, BigDecimal saldo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}