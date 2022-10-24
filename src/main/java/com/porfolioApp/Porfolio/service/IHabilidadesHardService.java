package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.HabilidadesHard;
import java.util.List;

public interface IHabilidadesHardService {
    
    public List<HabilidadesHard> verHabilidadesHard();
    
    public void crearHabilidadesHard (HabilidadesHard habh);
    
    public void borrarHabilidadesHard (Long id); 
    
    public void editarHabilidadesHard(HabilidadesHard habh);
    
}