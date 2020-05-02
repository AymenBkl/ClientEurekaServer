package com.projet.tp2.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idFormation;

    @Column(nullable = false,length = 20)
    private String nom;


}

 