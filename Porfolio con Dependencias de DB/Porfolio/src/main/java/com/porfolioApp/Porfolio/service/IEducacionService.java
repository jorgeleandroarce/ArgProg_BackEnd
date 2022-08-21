package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion (Educacion edu);
    
    public void borrarEducacion (Long id); 
    
    public void editarEducacion(Educacion edu);
    
}