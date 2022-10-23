package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Experiencia;
import com.porfolioApp.Porfolio.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
       return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
       expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Optional<Experiencia> buscarExperiencia(Long id) {
            return expRepo.findById(id);
    }
    
}