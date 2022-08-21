package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.HabilidadesHard;
import com.porfolioApp.Porfolio.repository.HabilidadesHardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesHardService implements IHabilidadesHardService {

    @Autowired
    public HabilidadesHardRepository habhRepo;
    
    @Override
    public List<HabilidadesHard> verHabilidadesHard() {
       return habhRepo.findAll();
    }

    @Override
    public void crearHabilidadesHard(HabilidadesHard habh) {
       habhRepo.save(habh);
    }

    @Override
    public void borrarHabilidadesHard(Long id) {
        habhRepo.deleteById(id);
    }

    @Override
    public void editarHabilidadesHard(HabilidadesHard habh) {
       habhRepo.save(habh);
    }
    
}