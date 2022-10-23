package com.porfolioApp.Porfolio.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoProyectos {
    
    private String nombre;
    private String logo;
    private String url;
    private String fecha;
    private String descripcion;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombre, String logo, String url, 
            String fecha, String descripcion) {
        
        this.nombre = nombre;
        this.logo = logo;
        this.url = url;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
}
