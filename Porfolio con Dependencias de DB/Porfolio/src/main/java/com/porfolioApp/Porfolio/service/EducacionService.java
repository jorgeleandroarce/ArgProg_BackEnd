package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Educacion;
import com.porfolioApp.Porfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEducacion() {
       return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
       eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void editarEducacion(Educacion edu) {
       eduRepo.save(edu);
    }
    
}