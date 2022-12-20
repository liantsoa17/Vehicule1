package com.example.vehicule1.service;

import com.example.vehicule1.model.Societe;
import com.example.vehicule1.model.Token;
import com.example.vehicule1.repository.TokenRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TokenService {
    private final TokenRepository tokenRepository;


    public TokenService(TokenRepository repo ) {
        this.tokenRepository = repo;

    }
    public List<Token> findAllToken() {
        return tokenRepository.findAll();
    }
    public Token findById(Integer id) {
        return tokenRepository.findById(id).get();
    }
    public Token saveSociete(Token carre) {
        return tokenRepository.save(carre);
    }
}
