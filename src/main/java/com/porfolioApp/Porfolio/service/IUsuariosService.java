package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Usuarios;
import java.util.Optional;

public interface IUsuariosService {
    
    public Optional<Usuarios> buscarUsuario (Long id);
    
}