package com.example.vehicule1.controller;

import com.example.vehicule1.model.Assurance;
import com.example.vehicule1.model.Kilometrage;
import com.example.vehicule1.model.Societe;
import com.example.vehicule1.model.Vehicule;
import com.example.vehicule1.service.AssuranceService;
import com.example.vehicule1.service.KilometrageService;
import com.example.vehicule1.service.SocieteService;
import com.example.vehicule1.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@CrossOrigin
@RestController
public class AllController {
    @Autowired
    KilometrageService kilometrageService;

    @Autowired
    AssuranceService assuranceService;

    @Autowired
    VehiculeService vehiculeService;

    @Autowired
    SocieteService societeService;


    @GetMapping("/vehicule")
    private List<Vehicule> getAllVehicule(){
        return  vehiculeService.findAllVehicule();
    }


    @GetMapping("/vehicule/{id}")
    private Vehicule getVehicule(@PathVariable("id") Integer id){
        return vehiculeService.findById(id);
    }
    @PostMapping("/savevehicule")
    private Integer saveVehicule(@RequestBody Vehicule vehicule){
        vehiculeService.saveVehicule(vehicule);
        return vehicule.getId();
    }

    @GetMapping("/kilometrage")
    private List<Kilometrage> getAllKilometrage(){
        return  kilometrageService.findAllKilometrage();
    }

    @GetMapping("/kilometrage/{id}")
    private Kilometrage getKilometrage(@PathVariable("id") Integer id){
        return kilometrageService.findById(id);
    }
    @PostMapping("/savekilometrage")
    private Integer saveKilometrage(@RequestBody Kilometrage kilometrage){
       kilometrageService.saveKilometrage(kilometrage);
       return  kilometrage.getId();
    }

    @GetMapping("/assurance")
    private List<Assurance> getAllAssurance(){
        return  assuranceService.findAllAssurance();
    }

    @GetMapping("/assurance/{id}")
    private Assurance getAssurance(@PathVariable("id") Integer id){
        return assuranceService.findById(id);
    }
    @PostMapping("/saveassurance")
    private Integer saveAssurance(@RequestBody Assurance assurance){
        assuranceService.saveAssurance(assurance);
        return  assurance.getId();
    }

    @GetMapping("/societe")
    private List<Societe> getAllSociete(){
        return  societeService.findAllSociete();
    }



}
