package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Proyectos;
import com.porfolioApp.Porfolio.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proyRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
       return proyRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proy) {
       proyRepo.save(proy);
    }

    @Override
    public void borrarProyectos(Long id) {
        proyRepo.deleteById(id);
    }
    
    @Override
    public Optional<Proyectos> buscarProyectos(Long id) {
            return proyRepo.findById(id);
    }

}
