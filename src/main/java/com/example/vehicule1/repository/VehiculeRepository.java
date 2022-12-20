package com.example.vehicule1.repository;

import com.example.vehicule1.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Integer> {

}