package com.porfolioApp.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String logoempresa;
    private String sitioweb;
    private String telefono;
    private String cargo;
    private String periodo;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String logoempresa, String sitioweb, 
            String telefono, String cargo, String periodo, String descripcion) {
        this.id = id;
        this.empresa = empresa;
        this.logoempresa = logoempresa;
        this.sitioweb = sitioweb;
        this.telefono = telefono;
        this.cargo = cargo;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
}




