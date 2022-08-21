package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Usuarios;
import com.porfolioApp.Porfolio.repository.UsuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    public UsuariosRepository usuRepo;
    
    @Override
    public List<Usuarios> verUsuarios() {
       return usuRepo.findAll();
    }

    @Override
    public void crearUsuarios(Usuarios usu) {
       usuRepo.save(usu);
    }

    @Override
    public void borrarUsuarios(Long id) {
        usuRepo.deleteById(id);
    }

    @Override
    public void editarUsuarios(Usuarios usu) {
       usuRepo.save(usu);
    }
    
}