package com.example.vehicule1.service;

import com.example.vehicule1.model.Assurance;
import com.example.vehicule1.repository.AssuranceRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AssuranceService {
    private final AssuranceRepository assuranceRepository;


    public AssuranceService(AssuranceRepository repo ) {
        this.assuranceRepository=repo;

    }
    public List<Assurance> findAllAssurance() {
        return assuranceRepository.findAll();
    }
    public Assurance findById(Integer id) {
        return assuranceRepository.findById(id).get();
    }
    public Assurance saveAssurance(Assurance carre) {
        return assuranceRepository.save(carre);
    }
}
