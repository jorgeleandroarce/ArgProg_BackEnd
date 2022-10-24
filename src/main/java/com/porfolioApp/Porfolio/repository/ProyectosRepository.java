package com.porfolioApp.Porfolio.repository;

import com.porfolioApp.Porfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
