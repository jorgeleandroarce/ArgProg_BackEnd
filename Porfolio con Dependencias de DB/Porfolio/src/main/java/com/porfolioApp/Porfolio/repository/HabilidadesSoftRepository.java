package com.porfolioApp.Porfolio.repository;

import com.porfolioApp.Porfolio.model.HabilidadesSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesSoftRepository extends JpaRepository <HabilidadesSoft, Long> {
    
}

