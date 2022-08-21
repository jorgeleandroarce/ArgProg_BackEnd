package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyectos (Proyectos proy);
    
    public void borrarProyectos (Long id); 
    
    public void editarProyectos (Proyectos proy);
    
}