package com.projet.tp2.demo;

import java.util.List;

import com.projet.tp2.demo.entities.Formation;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FormationRepository extends JpaRepository<Formation,Long> {
    
    List<Formation> findFormationsByNomIsStrartingWith(String n);

    
}