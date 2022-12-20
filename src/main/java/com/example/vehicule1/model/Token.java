package com.example.vehicule1.model;

import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "token")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "valeur")
    private String valeur ;

    @Column(name = "expiration")
    private Timestamp expiration;

    @Column(name = "idsociete")
    private Integer idSociete;



}
