package com.porfolioApp.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadesHard {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tipo;
    private String puntaje;

    public HabilidadesHard() {
    }

    public HabilidadesHard(Long id, String tipo, String puntaje) {
        this.id = id;
        this.tipo = tipo;
        this.puntaje = puntaje;
    }
}
