package com.example.bankingapi.dto;

public class UserResponse {

    private Long id;
    private String nome;
    private String email;

    public UserResponse(Long id, String nome, String email){
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }
}
