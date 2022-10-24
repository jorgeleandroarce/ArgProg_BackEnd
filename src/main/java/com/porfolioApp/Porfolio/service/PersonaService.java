package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Persona;
import com.porfolioApp.Porfolio.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public void crearPersona(Persona per) {
       persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Optional<Persona> buscarPersona(Long id) {
            return persoRepo.findById(id);
    }
        
}
