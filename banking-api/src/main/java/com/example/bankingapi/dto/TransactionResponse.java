package com.example.bankingapi.dto;

import com.example.bankingapi.entity.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponse {

    private Long id;
    private TransactionType tipo;
    private BigDecimal valor;
    private LocalDateTime data;

    public TransactionResponse(
            Long id,
            TransactionType tipo,
            BigDecimal valor,
            LocalDateTime data) {

        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public TransactionType getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }
}