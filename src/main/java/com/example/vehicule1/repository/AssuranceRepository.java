package com.example.vehicule1.repository;

import com.example.vehicule1.model.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AssuranceRepository extends JpaRepository<Assurance,Integer> {
    List<Assurance>  findByIdVehicule(Integer id);

}
