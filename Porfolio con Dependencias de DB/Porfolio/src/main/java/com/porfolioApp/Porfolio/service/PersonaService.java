package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Persona;
import com.porfolioApp.Porfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersona() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
       persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void editarPersona(Persona per) {
       persoRepo.save(per);
    }
    
}
