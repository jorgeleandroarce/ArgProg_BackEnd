package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersona();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id); 
    
    public void editarPersona (Persona per);
    
}
