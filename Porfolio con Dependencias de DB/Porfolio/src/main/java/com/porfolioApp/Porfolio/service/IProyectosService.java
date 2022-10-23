package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Proyectos;
import java.util.List;
import java.util.Optional;

public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyectos (Proyectos proy);
    
    public void borrarProyectos (Long id); 
    
    public Optional<Proyectos> buscarProyectos (Long id);
    
}