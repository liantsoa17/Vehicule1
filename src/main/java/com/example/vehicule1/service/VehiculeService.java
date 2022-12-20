package com.example.vehicule1.service;

import com.example.vehicule1.model.Vehicule;
import com.example.vehicule1.repository.AssuranceRepository;
import com.example.vehicule1.repository.KilometrageRepository;
import com.example.vehicule1.repository.VehiculeRepository;
import com.example.vehicule1.repository.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VehiculeService {
    private final VehiculeRepository vehiculeRepository;
    private final AssuranceRepository assuranceRepository;
    private final KilometrageRepository kilometrageRepository;





    public VehiculeService(VehiculeRepository repo, AssuranceRepository assuranceRepository, KilometrageRepository kilometrageRepository) {
        this.vehiculeRepository = repo;

        this.assuranceRepository = assuranceRepository;
        this.kilometrageRepository = kilometrageRepository;
    }
    public List<Vehicule> findAllVehicule() {
        return vehiculeRepository.findAll();
    }
    public Vehicule findById(Integer id) {
        return vehiculeRepository.findById(id).get();
    }
    public Vehicule saveVehicule(Vehicule carre) {
        return vehiculeRepository.save(carre);
    }

    public void setKilometrage(Vehicule v){
        v.setKilometrage(kilometrageRepository.findByVehiculeId(v.getId()));
    }
    public  void setAssurance(Vehicule v){
        v.setAssurance(assuranceRepository.findByIdVehicule(v.getId()));
    }

}
