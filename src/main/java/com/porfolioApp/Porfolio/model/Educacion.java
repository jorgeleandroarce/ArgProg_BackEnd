package com.porfolioApp.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String escuela;
    private String logotipo;
    private String sitioweb;
    private String titulo;
    private String periodo;

    public Educacion() {
    }

    public Educacion(String escuela, String logotipo, String sitioweb, 
            String titulo, String periodo) {
        
        this.escuela = escuela;
        this.logotipo = logotipo;
        this.sitioweb = sitioweb;
        this.titulo = titulo;
        this.periodo = periodo;
    }
}
