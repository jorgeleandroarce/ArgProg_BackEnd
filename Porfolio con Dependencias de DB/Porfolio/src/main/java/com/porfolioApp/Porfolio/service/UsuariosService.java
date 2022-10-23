package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Usuarios;
import com.porfolioApp.Porfolio.repository.UsuariosRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    public UsuariosRepository usuRepo;
    
    @Override
    public Optional<Usuarios> buscarUsuario (Long id) {
       return usuRepo.findById(id);
    }

}