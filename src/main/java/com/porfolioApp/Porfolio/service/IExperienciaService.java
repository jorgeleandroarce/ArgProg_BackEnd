package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Experiencia;
import java.util.List;
import java.util.Optional;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia (Experiencia exp);
    
    public void borrarExperiencia (Long id);
    
    public Optional<Experiencia> buscarExperiencia (Long id);
    
}