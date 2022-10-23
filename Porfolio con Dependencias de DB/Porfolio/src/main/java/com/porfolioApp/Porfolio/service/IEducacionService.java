package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Educacion;
import java.util.List;
import java.util.Optional;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion (Educacion edu);
    
    public void borrarEducacion (Long id); 
    
    public Optional<Educacion> buscarEducacion (Long id);
    
}