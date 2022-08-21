package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia (Experiencia exp);
    
    public void borrarExperiencia (Long id); 
    
    public void editarExperiencia(Experiencia exp);
    
}