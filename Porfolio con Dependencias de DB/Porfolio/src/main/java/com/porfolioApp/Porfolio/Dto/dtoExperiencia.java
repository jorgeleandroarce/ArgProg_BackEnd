package com.porfolioApp.Porfolio.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoExperiencia {
    
    private String empresa;
    private String logoempresa;
    private String sitioweb;
    private String telefono;
    private String cargo;
    private String periodo;
    private String descripcion;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String empresa, String logoempresa, String sitioweb, 
            String telefono, String cargo, String periodo, String descripcion) {
        
        this.empresa = empresa;
        this.logoempresa = logoempresa;
        this.sitioweb = sitioweb;
        this.telefono = telefono;
        this.cargo = cargo;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
    
}
