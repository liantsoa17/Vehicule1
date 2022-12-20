package com.example.vehicule1.repository;

import com.example.vehicule1.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TokenRepository extends JpaRepository<Token,Integer> {

}