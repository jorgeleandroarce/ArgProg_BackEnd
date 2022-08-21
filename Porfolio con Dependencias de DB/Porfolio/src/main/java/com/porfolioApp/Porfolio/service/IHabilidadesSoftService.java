package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.HabilidadesSoft;
import java.util.List;

public interface IHabilidadesSoftService {
    
    public List<HabilidadesSoft> verHabilidadesSoft();
    
    public void crearHabilidadesSoft (HabilidadesSoft habs);
    
    public void borrarHabilidadesSoft (Long id); 
    
    public void editarHabilidadesSoft(HabilidadesSoft habs);
    
}