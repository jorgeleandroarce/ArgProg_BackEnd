package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Persona;
import java.util.Optional;

public interface IPersonaService {
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id); 
    
    public Optional<Persona> buscarPersona (Long id);
    
}
