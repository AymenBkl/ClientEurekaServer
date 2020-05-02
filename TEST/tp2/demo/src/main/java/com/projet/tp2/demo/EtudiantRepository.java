package com.projet.tp2.demo;

import java.util.List;

import com.projet.tp2.demo.entities.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    
    List<Etudiant> findEtudiantsByNomIsStrartingWith(String n);

    
}