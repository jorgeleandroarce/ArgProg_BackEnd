package com.porfolioApp.Porfolio.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoEducacion {
    
    private String escuela;
    private String logotipo;
    private String sitioweb;
    private String titulo;
    private String periodo;

    public dtoEducacion() {
    }

    public dtoEducacion(String escuela, String logotipo, String sitioweb, String titulo, String periodo) {
        this.escuela = escuela;
        this.logotipo = logotipo;
        this.sitioweb = sitioweb;
        this.titulo = titulo;
        this.periodo = periodo;
    }
    
    
    
}
