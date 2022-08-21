package com.porfolioApp.Porfolio.repository;

import com.porfolioApp.Porfolio.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios, Long> {
    
}
