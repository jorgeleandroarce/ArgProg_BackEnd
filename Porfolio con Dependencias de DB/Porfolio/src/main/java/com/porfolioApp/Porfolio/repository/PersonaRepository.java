package com.porfolioApp.Porfolio.repository;

import com.porfolioApp.Porfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
