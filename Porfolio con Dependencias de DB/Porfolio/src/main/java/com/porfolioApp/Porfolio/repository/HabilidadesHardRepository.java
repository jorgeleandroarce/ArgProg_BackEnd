package com.porfolioApp.Porfolio.repository;

import com.porfolioApp.Porfolio.model.HabilidadesHard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesHardRepository extends JpaRepository <HabilidadesHard, Long> {
    
}

