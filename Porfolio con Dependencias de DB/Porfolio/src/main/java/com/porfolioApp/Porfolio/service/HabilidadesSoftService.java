package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.HabilidadesSoft;
import com.porfolioApp.Porfolio.repository.HabilidadesSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesSoftService implements IHabilidadesSoftService {

    @Autowired
    public HabilidadesSoftRepository habsRepo;
    
    @Override
    public List<HabilidadesSoft> verHabilidadesSoft() {
       return habsRepo.findAll();
    }

    @Override
    public void crearHabilidadesSoft(HabilidadesSoft habs) {
       habsRepo.save(habs);
    }

    @Override
    public void borrarHabilidadesSoft(Long id) {
        habsRepo.deleteById(id);
    }

    @Override
    public void editarHabilidadesSoft(HabilidadesSoft habs) {
       habsRepo.save(habs);
    }
    
}